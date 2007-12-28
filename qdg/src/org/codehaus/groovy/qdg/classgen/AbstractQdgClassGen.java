package org.codehaus.groovy.qdg.classgen;

import org.codehaus.groovy.ast.AnnotatedNode;
import org.codehaus.groovy.ast.ClassCodeVisitorSupport;
import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.ast.ConstructorNode;
import org.codehaus.groovy.ast.FieldNode;
import org.codehaus.groovy.ast.MethodNode;
import org.codehaus.groovy.ast.ModuleNode;
import org.codehaus.groovy.ast.PropertyNode;
import org.codehaus.groovy.ast.expr.ArgumentListExpression;
import org.codehaus.groovy.ast.expr.ArrayExpression;
import org.codehaus.groovy.ast.expr.AttributeExpression;
import org.codehaus.groovy.ast.expr.BinaryExpression;
import org.codehaus.groovy.ast.expr.BitwiseNegationExpression;
import org.codehaus.groovy.ast.expr.BooleanExpression;
import org.codehaus.groovy.ast.expr.CastExpression;
import org.codehaus.groovy.ast.expr.ClassExpression;
import org.codehaus.groovy.ast.expr.ClosureExpression;
import org.codehaus.groovy.ast.expr.ClosureListExpression;
import org.codehaus.groovy.ast.expr.ConstantExpression;
import org.codehaus.groovy.ast.expr.ConstructorCallExpression;
import org.codehaus.groovy.ast.expr.DeclarationExpression;
import org.codehaus.groovy.ast.expr.ElvisOperatorExpression;
import org.codehaus.groovy.ast.expr.Expression;
import org.codehaus.groovy.ast.expr.FieldExpression;
import org.codehaus.groovy.ast.expr.GStringExpression;
import org.codehaus.groovy.ast.expr.ListExpression;
import org.codehaus.groovy.ast.expr.MapEntryExpression;
import org.codehaus.groovy.ast.expr.MapExpression;
import org.codehaus.groovy.ast.expr.MethodCallExpression;
import org.codehaus.groovy.ast.expr.MethodPointerExpression;
import org.codehaus.groovy.ast.expr.NotExpression;
import org.codehaus.groovy.ast.expr.PostfixExpression;
import org.codehaus.groovy.ast.expr.PrefixExpression;
import org.codehaus.groovy.ast.expr.PropertyExpression;
import org.codehaus.groovy.ast.expr.RangeExpression;
import org.codehaus.groovy.ast.expr.RegexExpression;
import org.codehaus.groovy.ast.expr.SpreadExpression;
import org.codehaus.groovy.ast.expr.SpreadMapExpression;
import org.codehaus.groovy.ast.expr.StaticMethodCallExpression;
import org.codehaus.groovy.ast.expr.TernaryExpression;
import org.codehaus.groovy.ast.expr.TupleExpression;
import org.codehaus.groovy.ast.expr.UnaryMinusExpression;
import org.codehaus.groovy.ast.expr.UnaryPlusExpression;
import org.codehaus.groovy.ast.expr.VariableExpression;
import org.codehaus.groovy.ast.stmt.AssertStatement;
import org.codehaus.groovy.ast.stmt.BlockStatement;
import org.codehaus.groovy.ast.stmt.BreakStatement;
import org.codehaus.groovy.ast.stmt.CaseStatement;
import org.codehaus.groovy.ast.stmt.CatchStatement;
import org.codehaus.groovy.ast.stmt.ContinueStatement;
import org.codehaus.groovy.ast.stmt.DoWhileStatement;
import org.codehaus.groovy.ast.stmt.ExpressionStatement;
import org.codehaus.groovy.ast.stmt.ForStatement;
import org.codehaus.groovy.ast.stmt.IfStatement;
import org.codehaus.groovy.ast.stmt.ReturnStatement;
import org.codehaus.groovy.ast.stmt.Statement;
import org.codehaus.groovy.ast.stmt.SwitchStatement;
import org.codehaus.groovy.ast.stmt.SynchronizedStatement;
import org.codehaus.groovy.ast.stmt.ThrowStatement;
import org.codehaus.groovy.ast.stmt.TryCatchStatement;
import org.codehaus.groovy.ast.stmt.WhileStatement;
import org.codehaus.groovy.control.SourceUnit;
import org.codehaus.groovy.control.CompilationFailedException;
import org.codehaus.groovy.syntax.Token;
import org.codehaus.groovy.syntax.Types;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.util.TraceClassVisitor;
import org.objectweb.asm.util.CheckClassAdapter;

import java.io.*;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: chanwit
 * Date: 23 ¸.¤. 2550
 * Time: 6:18:59
 * To change this template use File | Settings | File Templates.
 */
abstract class AbstractQdgClassGen extends ClassCodeVisitorSupport implements Opcodes {

    protected ClassVisitor cv;
    protected ClassWriter cw;
    
    protected String internalName;
    protected String baseInternalName;
    protected ModuleNode module;

    private SourceUnit sourceUnit;
    private String filename;
    private String output;
    
    protected static String capitalize(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1, name.length());
    }
    
    protected Statement createGetterBlock(PropertyNode propertyNode, FieldNode field) {
        Expression expression = new FieldExpression(field);
        return new ReturnStatement(expression);
    }

    protected Statement createSetterBlock(PropertyNode propertyNode, FieldNode field) {
        Expression expression = new FieldExpression(field);
        return new ExpressionStatement(
            new BinaryExpression(expression, Token.newSymbol(Types.EQUAL, 0, 0), new VariableExpression("value")));
    }    

    public AbstractQdgClassGen(String filename) {
        this.filename = filename;
        this.cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        PrintWriter pw = new PrintWriter(System.out);
        TraceClassVisitor tcv = new TraceClassVisitor(this.cw, pw);
        this.cv = new CheckClassAdapter(tcv);
    }

    public void generate(String output) {
        this.output = output;
        try {
            module = getModule();
            List<ClassNode> clsList = (List<ClassNode>) module.getClasses();
            ResolveVisitor r = new ResolveVisitor();
            for (ClassNode c : clsList) {
                r.startResolving(c, this.sourceUnit);                
            }            
            for (ClassNode c : clsList) {
                this.visitClass(c);
                try {
                    writeOutput(cw.toByteArray());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ModuleNode getModule() throws IOException, CompilationFailedException {
        RandomAccessFile fi = new RandomAccessFile(filename, "r");
        byte[] b = new byte[(int) fi.length()];
        fi.readFully(b);
        fi.close();
        fi = null;
        this.sourceUnit = SourceUnit.create("", new String(b));
        sourceUnit.parse();
        sourceUnit.completePhase();
        sourceUnit.convert();
        ModuleNode a = sourceUnit.getAST();
        return a;
    }

    protected SourceUnit getSourceUnit() {
        return this.sourceUnit;
    }

    protected void writeOutput(byte[] bytes) throws Exception {
        String path = this.output + "/" + getPackagePath(this.internalName);
        File fpath = new File(path);
        if (fpath.exists() == false) {
            fpath.mkdirs();
        }
        File fo = new File(this.output + "/" + this.internalName + ".class");
        FileOutputStream fos = new FileOutputStream(fo);
        fos.write(bytes);
        fos.close();
    }

    private String getPackagePath(String name) {
        int i = name.lastIndexOf('/');
        if (i == -1) return "";
        return name.substring(0, i);
    }

	@Override
	public void visitAnnotations(AnnotatedNode node) {
		// TODO Auto-generated method stub
		System.out.println("visitAnnotations");
		super.visitAnnotations(node);
	}

	@Override
	public void visitAssertStatement(AssertStatement statement) {
		// TODO Auto-generated method stub
		System.out.println("visitAssertStatement");
		super.visitAssertStatement(statement);
	}

	@Override
	public void visitBlockStatement(BlockStatement block) {
		// TODO Auto-generated method stub
		System.out.println("visitBlockStatement");
		super.visitBlockStatement(block);
	}

	@Override
	public void visitBreakStatement(BreakStatement statement) {
		// TODO Auto-generated method stub
		System.out.println("visitBreakStatement");
		super.visitBreakStatement(statement);
	}

	@Override
	public void visitCaseStatement(CaseStatement statement) {
		// TODO Auto-generated method stub
		System.out.println("visitCaseStatement");
		super.visitCaseStatement(statement);
	}

	@Override
	public void visitCatchStatement(CatchStatement statement) {
		// TODO Auto-generated method stub
		System.out.println("visitCatchStatement");
		super.visitCatchStatement(statement);
	}

	@Override
	public void visitClass(ClassNode node) {
		// TODO Auto-generated method stub
		System.out.println("visitClass");
		super.visitClass(node);
	}

	@Override
	protected void visitClassCodeContainer(Statement code) {
		// TODO Auto-generated method stub
		System.out.println("visitClassCodeContainer");
		super.visitClassCodeContainer(code);
	}

	@Override
	public void visitConstructor(ConstructorNode node) {
		// TODO Auto-generated method stub
		System.out.println("visitConstructor");
		super.visitConstructor(node);
	}

	@Override
	protected void visitConstructorOrMethod(MethodNode node,
			boolean isConstructor) {
		// TODO Auto-generated method stub
		System.out.println("visitConstructorOrMethod");
		super.visitConstructorOrMethod(node, isConstructor);
	}

	@Override
	public void visitContinueStatement(ContinueStatement statement) {
		// TODO Auto-generated method stub
		System.out.println("visitContinueStatement");
		super.visitContinueStatement(statement);
	}

	@Override
	public void visitDoWhileLoop(DoWhileStatement loop) {
		// TODO Auto-generated method stub
		System.out.println("visitDoWhileLoop");
		super.visitDoWhileLoop(loop);
	}

	@Override
	public void visitExpressionStatement(ExpressionStatement statement) {
		// TODO Auto-generated method stub
		System.out.println("visitExpressionStatement");
		super.visitExpressionStatement(statement);
	}

	@Override
	public void visitField(FieldNode node) {
		// TODO Auto-generated method stub
		System.out.println("visitField");
		super.visitField(node);
	}

	@Override
	public void visitForLoop(ForStatement forLoop) {
		// TODO Auto-generated method stub
		System.out.println("visitForLoop");
		super.visitForLoop(forLoop);
	}

	@Override
	public void visitIfElse(IfStatement ifElse) {
		// TODO Auto-generated method stub
		System.out.println("visitIfElse");
		super.visitIfElse(ifElse);
	}

	@Override
	public void visitMethod(MethodNode node) {
		// TODO Auto-generated method stub
		System.out.println("visitMethod");
		super.visitMethod(node);
	}

	@Override
	public void visitProperty(PropertyNode node) {
		// TODO Auto-generated method stub
		System.out.println("visitProperty");
		super.visitProperty(node);
	}

	@Override
	public void visitReturnStatement(ReturnStatement statement) {
		// TODO Auto-generated method stub
		System.out.println("visitReturnStatement");
		super.visitReturnStatement(statement);
	}

	@Override
	protected void visitStatement(Statement statement) {
		// TODO Auto-generated method stub
		System.out.println("visitStatement");
		super.visitStatement(statement);
	}

	@Override
	public void visitSwitch(SwitchStatement statement) {
		// TODO Auto-generated method stub
		System.out.println("visitSwitch");
		super.visitSwitch(statement);
	}

	@Override
	public void visitSynchronizedStatement(SynchronizedStatement statement) {
		// TODO Auto-generated method stub
		System.out.println("visitSynchronizedStatement");
		super.visitSynchronizedStatement(statement);
	}

	@Override
	public void visitThrowStatement(ThrowStatement statement) {
		// TODO Auto-generated method stub
		System.out.println("visitThrowStatement");
		super.visitThrowStatement(statement);
	}

	@Override
	public void visitTryCatchFinally(TryCatchStatement statement) {
		// TODO Auto-generated method stub
		System.out.println("visitTryCatchFinally");
		super.visitTryCatchFinally(statement);
	}

	@Override
	public void visitWhileLoop(WhileStatement loop) {
		// TODO Auto-generated method stub
		System.out.println("visitWhileLoop");
		super.visitWhileLoop(loop);
	}

	@Override
	public void visitArgumentlistExpression(ArgumentListExpression ale) {
		// TODO Auto-generated method stub
		System.out.println("visitArgumentlistExpression");
		super.visitArgumentlistExpression(ale);
	}

	@Override
	public void visitArrayExpression(ArrayExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitArrayExpression");
		super.visitArrayExpression(expression);
	}

	@Override
	public void visitAttributeExpression(AttributeExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitAttributeExpression");
		super.visitAttributeExpression(expression);
	}

	@Override
	public void visitBinaryExpression(BinaryExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitBinaryExpression");
		super.visitBinaryExpression(expression);
	}

	@Override
	public void visitBitwiseNegationExpression(
			BitwiseNegationExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitBitwiseNegationExpression");
		super.visitBitwiseNegationExpression(expression);
	}

	@Override
	public void visitBooleanExpression(BooleanExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitBooleanExpression");
		super.visitBooleanExpression(expression);
	}

	@Override
	public void visitCastExpression(CastExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitCastExpression");
		super.visitCastExpression(expression);
	}

	@Override
	public void visitClassExpression(ClassExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitClassExpression");
		super.visitClassExpression(expression);
	}

	@Override
	public void visitClosureExpression(ClosureExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitClosureExpression");
		super.visitClosureExpression(expression);
	}

	@Override
	public void visitClosureListExpression(ClosureListExpression cle) {
		// TODO Auto-generated method stub
		System.out.println("visitClosureListExpression");
		super.visitClosureListExpression(cle);
	}

	@Override
	public void visitConstantExpression(ConstantExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitConstantExpression");
		System.out.println("text: " +expression.getText());
		System.out.println("value: " +expression.getValue());
		System.out.println("type: " +expression.getType());
		super.visitConstantExpression(expression);
	}

	@Override
	public void visitConstructorCallExpression(ConstructorCallExpression call) {
		// TODO Auto-generated method stub
		System.out.println("visitConstructorCallExpression");
		super.visitConstructorCallExpression(call);
	}

	@Override
	public void visitDeclarationExpression(DeclarationExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitDeclarationExpression");
		super.visitDeclarationExpression(expression);
	}

	@Override
	public void visitFieldExpression(FieldExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitFieldExpression");
		super.visitFieldExpression(expression);
	}

	@Override
	public void visitGStringExpression(GStringExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitGStringExpression");
		super.visitGStringExpression(expression);
	}

	@Override
	public void visitListExpression(ListExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitListExpression");
		super.visitListExpression(expression);
	}

	@Override
	protected void visitListOfExpressions(List list) {
		// TODO Auto-generated method stub
		System.out.println("visitListOfExpressions");
		super.visitListOfExpressions(list);
	}

	@Override
	public void visitMapEntryExpression(MapEntryExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitMapEntryExpression");
		super.visitMapEntryExpression(expression);
	}

	@Override
	public void visitMapExpression(MapExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitMapExpression");
		super.visitMapExpression(expression);
	}

	@Override
	public void visitMethodCallExpression(MethodCallExpression call) {
		// TODO Auto-generated method stub
		System.out.println("visitMethodCallExpression");
		System.out.println(call.getText());
		System.out.println(call.getType());
		System.out.println(call.getMethod());
		super.visitMethodCallExpression(call);
	}

	@Override
	public void visitMethodPointerExpression(MethodPointerExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitMethodPointerExpression");
		super.visitMethodPointerExpression(expression);
	}

	@Override
	public void visitNotExpression(NotExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitNotExpression");
		super.visitNotExpression(expression);
	}

	@Override
	public void visitPostfixExpression(PostfixExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitPostfixExpression");
		super.visitPostfixExpression(expression);
	}

	@Override
	public void visitPrefixExpression(PrefixExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitPrefixExpression");
		super.visitPrefixExpression(expression);
	}

	@Override
	public void visitPropertyExpression(PropertyExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitPropertyExpression");
		super.visitPropertyExpression(expression);
	}

	@Override
	public void visitRangeExpression(RangeExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitRangeExpression");
		super.visitRangeExpression(expression);
	}

	@Override
	public void visitRegexExpression(RegexExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitRegexExpression");
		super.visitRegexExpression(expression);
	}

	@Override
	public void visitShortTernaryExpression(ElvisOperatorExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitShortTernaryExpression");
		super.visitShortTernaryExpression(expression);
	}

	@Override
	public void visitSpreadExpression(SpreadExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitSpreadExpression");
		super.visitSpreadExpression(expression);
	}

	@Override
	public void visitSpreadMapExpression(SpreadMapExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitSpreadMapExpression");
		super.visitSpreadMapExpression(expression);
	}

	@Override
	public void visitStaticMethodCallExpression(StaticMethodCallExpression call) {
		// TODO Auto-generated method stub
		System.out.println("visitStaticMethodCallExpression");
		super.visitStaticMethodCallExpression(call);
	}

	@Override
	public void visitTernaryExpression(TernaryExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitTernaryExpression");
		super.visitTernaryExpression(expression);
	}

	@Override
	public void visitTupleExpression(TupleExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitTupleExpression");
		super.visitTupleExpression(expression);
	}

	@Override
	public void visitUnaryMinusExpression(UnaryMinusExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitUnaryMinusExpression");
		super.visitUnaryMinusExpression(expression);
	}

	@Override
	public void visitUnaryPlusExpression(UnaryPlusExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitUnaryPlusExpression");
		super.visitUnaryPlusExpression(expression);
	}

	@Override
	public void visitVariableExpression(VariableExpression expression) {
		// TODO Auto-generated method stub
		System.out.println("visitVariableExpression");
		super.visitVariableExpression(expression);
	}
        
}
