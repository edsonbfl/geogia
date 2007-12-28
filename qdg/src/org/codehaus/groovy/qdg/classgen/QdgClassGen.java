package org.codehaus.groovy.qdg.classgen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.codehaus.groovy.ast.ClassHelper;
import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.ast.ConstructorNode;
import org.codehaus.groovy.ast.MethodNode;
import org.codehaus.groovy.ast.Parameter;
import org.codehaus.groovy.ast.PropertyNode;
import org.codehaus.groovy.ast.FieldNode;
import org.codehaus.groovy.ast.expr.ClassExpression;
import org.codehaus.groovy.ast.expr.ClosureExpression;
import org.codehaus.groovy.ast.stmt.Statement;
import org.codehaus.groovy.classgen.BytecodeHelper;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class QdgClassGen extends AbstractQdgClassGen {

    private static final String CLOSURE_TYPE_DESC = "Lorg/codehaus/groovy/qdg/Closure;";
	private static final String CLOSURE_INTERNAL_NAME = "org/codehaus/groovy/qdg/Closure";
	private static final String closureBodySuffix = "__0";
	private ClassNode classNode;
	private FieldNode currentField;
//	private Object constructorNode;
//	private MethodNode methodNode;
//	private boolean outputReturn;
	
	private MethodVisitor mv;
//	private BytecodeHelper helper;
	
//	private List<Runnable> exceptionBlocks = new ArrayList<Runnable>();
	private List<FieldNode> closuresToInit = new ArrayList<FieldNode>();

    public QdgClassGen(String filename) {
        super(filename);
    }
    
	protected ClassNode getClassNode() {
		return classNode;
	}
	
//    private boolean methodNeedsReplacement(MethodNode m) {
//        // no method found, we need to replace
//        if (m==null) return true;
//        // method is in current class, nothing to be done
//        if (m.getDeclaringClass()==this.getClassNode()) return false;
//        // do not overwrite final
//        if ((m.getModifiers()&ACC_FINAL)!=0) return false;
//        return true;
//    }    
//    
//    private boolean isVargs(Parameter[] p) {
//        if (p.length==0) return false;
//        ClassNode clazz = p[p.length-1].getType();
//        return (clazz.isArray());
//    }
//    
//    private String[] buildExceptions(ClassNode[] exceptions) {
//        if (exceptions == null) return null;
//        String[] ret = new String[exceptions.length];
//        for (int i = 0; i < exceptions.length; i++) {
//            ret[i] = BytecodeHelper.getClassInternalName(exceptions[i]);
//        }
//        return ret;
//    }    

	public void visitInit(ClassNode node) {
		mv = cv.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
		mv.visitCode();
		mv.visitVarInsn(ALOAD, 0);
		mv.visitMethodInsn(INVOKESPECIAL, this.baseInternalName, "<init>", "()V");
		for(FieldNode fnode: closuresToInit) {
			mv.visitVarInsn(ALOAD, 0);
			mv.visitTypeInsn(NEW, CLOSURE_INTERNAL_NAME);
			mv.visitInsn(DUP);
			mv.visitVarInsn(ALOAD, 0);
			mv.visitLdcInsn(fnode.getName() + closureBodySuffix);
			mv.visitMethodInsn(INVOKESPECIAL, 
					CLOSURE_INTERNAL_NAME, 
					"<init>", 
					"(Ljava/lang/Object;Ljava/lang/String;)V"
			);
			mv.visitFieldInsn(PUTFIELD, 
					this.internalName, 
					fnode.getName(), 
					CLOSURE_TYPE_DESC
			);
		}
		mv.visitInsn(RETURN);

		mv.visitMaxs(0, 0);
		mv.visitEnd();
	}
	
    @Override
    public void visitClass(ClassNode node) {
        this.classNode = node;
        this.internalName = BytecodeHelper.getClassInternalName(node);
        this.baseInternalName = BytecodeHelper.getClassInternalName(node.getSuperClass());
        cv.visit(V1_6,
                node.getModifiers() + ACC_SUPER,
                this.internalName,
                null,                   // generics
                this.baseInternalName,  // super class
                null                    // interfaces
        );
        super.visitClass(node);
        visitInit(node);
        cv.visitEnd();
    }   

    @Override
    public void visitField(FieldNode node) {
    	this.currentField = node;      	
    	String fieldTypeDesc;
		if(node.getInitialExpression() instanceof ClosureExpression){
    		fieldTypeDesc = CLOSURE_TYPE_DESC;
    		closuresToInit.add(node);
    	} else {
    		fieldTypeDesc = BytecodeHelper.getTypeDescription(node.getType());
    	}
        FieldVisitor fv = cv.visitField(
                node.getModifiers(),
                node.getName(),
                fieldTypeDesc,
                null,
                null
        );
        super.visitField(node);
        fv.visitEnd();
    }

	@Override
    public void visitClosureExpression(ClosureExpression closureExpression) {
        super.visitClosureExpression(closureExpression);
    }	

	private void generatePropSetter(final String name,
			final String internalTypeDesc, final String setterName) {
    	mv = cv.visitMethod(ACC_PUBLIC  + ACC_SYNTHETIC,
    			setterName, 
    			"(Lorg/codehaus/groovy/qdg/Closure;)V", 
    			null, null);    	
    	mv.visitCode();    	
    	mv.visitVarInsn(ALOAD, 0);
    	mv.visitVarInsn(ALOAD, 1);
    	mv.visitFieldInsn(PUTFIELD, this.internalName, name, CLOSURE_TYPE_DESC);
    	mv.visitInsn(RETURN);

    	mv.visitMaxs(0, 0);
	}

	private void generatePropGetter(final String name,
			final String internalTypeDesc, final String getterName) {
        mv = cv.visitMethod(ACC_PUBLIC + ACC_SYNTHETIC,
        		getterName, 
        		"()Lorg/codehaus/groovy/qdg/Closure;", 
        		null, null);
        mv.visitCode();
        mv.visitVarInsn(ALOAD, 0);
		mv.visitFieldInsn(
        		GETFIELD, 
        		this.internalName, 
        		name, CLOSURE_TYPE_DESC
        );
        mv.visitInsn(ARETURN);

        mv.visitMaxs(0, 0);
        mv.visitEnd();
	}	
	
	@Override
	public void visitProperty(PropertyNode node) {
		System.out.println("property: " + node.getName());
        final String name = node.getName();
        final String internalTypeDesc = BytecodeHelper.getTypeDescription(this.getClassNode());        
        final String getterName = "get" + capitalize(name);
        final String setterName = "set" + capitalize(name);
        generatePropGetter(name, internalTypeDesc, getterName);
        generatePropSetter(name, internalTypeDesc, setterName);
	}
	
//	@Override
//	public void visitMethod(MethodNode node) {
//        this.constructorNode = null;
//        this.methodNode = node;
//        this.outputReturn = false;
//        super.visitMethod(node);
//	}
//
//	
//	@Override
//	protected void visitConstructorOrMethod(MethodNode node, boolean isConstructor) {
//        Parameter[] parameters = node.getParameters();
//        String methodType = BytecodeHelper.getMethodDescriptor(node.getReturnType(), parameters);
//
//        String signature = BytecodeHelper.getGenericsMethodSignature(node);
//        int modifiers = node.getModifiers();
//        if (isVargs(node.getParameters())) modifiers |= Opcodes.ACC_VARARGS;
//        mv = cv.visitMethod(modifiers, node.getName(), methodType, signature, buildExceptions(node.getExceptions()));
////        visitAnnotations(node, mv);
////        for (int i = 0; i < parameters.length; i++) {
////            visitParameterAnnotations(parameters[i], i, mv);
////        }
//        helper = new BytecodeHelper(mv);
//        if (!node.isAbstract()) {
//            Statement code = node.getCode();            
//            if (isConstructor && 
//            	(code == null || !((ConstructorNode)node).firstStatementIsSpecialConstructorCall())) {
//                // invokes the super class constructor
//                mv.visitVarInsn(ALOAD, 0);
//                mv.visitMethodInsn(INVOKESPECIAL, 
//                		BytecodeHelper.getClassInternalName(classNode.getSuperClass()),
//                		"<init>", "()V");
//            }
//
//            // ensure we save the current (meta) class in a register
//            (new ClassExpression(classNode)).visit(this);
//            mv.visitInsn(POP);
//            (new ClassExpression(ClassHelper.METACLASS_TYPE)).visit(this);
//            mv.visitInsn(POP);
//
//            // ----- HANDLE Body
//            super.visitConstructorOrMethod(node, isConstructor);
//            // ----- END
//            
//            if (!this.outputReturn || node.isVoidMethod()) {
//                mv.visitInsn(RETURN);
//            }
//
//            // lets do all the exception blocks
//            for(Runnable runnable: exceptionBlocks){
//                runnable.run();
//            }
//            exceptionBlocks.clear();
//            mv.visitMaxs(0, 0);
//        }
//        mv.visitEnd();
//        helper = null;
//    }	
}
