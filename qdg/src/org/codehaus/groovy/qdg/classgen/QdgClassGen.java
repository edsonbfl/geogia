package org.codehaus.groovy.qdg.classgen;

import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.ast.MethodNode;
import org.codehaus.groovy.ast.PropertyNode;
import org.codehaus.groovy.ast.FieldNode;
import org.codehaus.groovy.ast.expr.ClosureExpression;
import org.codehaus.groovy.ast.stmt.Statement;
import org.codehaus.groovy.classgen.BytecodeHelper;
import org.objectweb.asm.FieldVisitor;

public class QdgClassGen extends AbstractQdgClassGen {

    private ClassNode classNode;
	private FieldNode currentField;

    public QdgClassGen(String filename) {
        super(filename);
    }

    @Override
    public void visitClass(ClassNode node) {
        this.classNode = node;
        this.internalName = BytecodeHelper.getClassInternalName(node);
        this.baseInternalName = BytecodeHelper.getClassInternalName(node.getSuperClass());
        cv.visit(V1_6,
                node.getModifiers(),
                this.internalName,
                null,                   // generics
                this.baseInternalName,  // super class
                null                    // interfaces
        );
        super.visitClass(node);
        cv.visitEnd();
    }

    @Override
    public void visitField(FieldNode fieldNode) {
    	this.currentField = fieldNode;
        FieldVisitor fv = cv.visitField(
                fieldNode.getModifiers(),
                fieldNode.getName(),
                BytecodeHelper.getTypeDescription(fieldNode.getType()),
                null,
                null
        );
        super.visitField(fieldNode);
        fv.visitEnd();
    }

//    @Override
//	protected void visitConstructorOrMethod(MethodNode node, boolean isConstructor) {
//    	System.out.println("visitConstructorOrMethod: " + node.getName());
//		super.visitConstructorOrMethod(node, isConstructor);
//	}

	@Override
	protected void visitClassCodeContainer(Statement code) {
		System.out.println("code: " + code.getText());
		super.visitClassCodeContainer(code);
	}

	@Override
    public void visitClosureExpression(ClosureExpression closureExpression) {
    	System.out.println(currentField);
        System.out.println(closureExpression);
        super.visitClosureExpression(closureExpression);
    	
    }

    @Override
    public void visitProperty(PropertyNode propNode) {
        // super.visitProperty(propNode);
    }
}
