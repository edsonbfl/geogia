package org.codehaus.groovy.php;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.List;

import org.codehaus.groovy.ast.AnnotatedNode;
import org.codehaus.groovy.ast.ClassCodeVisitorSupport;
import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.ast.ConstructorNode;
import org.codehaus.groovy.ast.FieldNode;
import org.codehaus.groovy.ast.GroovyClassVisitor;
import org.codehaus.groovy.ast.GroovyCodeVisitor;
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

public class PhpClassGen extends ClassCodeVisitorSupport {

	private ClassNode classNode;
	private SourceUnit sourceUnit;
	private String filename;

	public PhpClassGen(String filename) {
		super();
		this.filename = filename;
	}

	private ModuleNode getModule() throws IOException, CompilationFailedException {
		RandomAccessFile fi = new RandomAccessFile(filename, "r");
		byte[] b = new byte[(int) fi.length()];
		fi.readFully(b);
		fi.close();
		fi = null;
		this.sourceUnit = SourceUnit.create("mine", new String(b));
		sourceUnit.parse();
		sourceUnit.completePhase();
		sourceUnit.convert();
		ModuleNode a = sourceUnit.getAST();
		return a;
	}

	public static void main(String[] args) throws Exception {
		PhpClassGen generator = new PhpClassGen("tests/MyController.groovy");
		ModuleNode a = generator.getModule();
		List<ClassNode> clsList = (List<ClassNode>) a.getClasses();
		for (ClassNode c : clsList) {
			generator.visitClass(c);
		}
	}

	@Override
	public void visitAnnotations(AnnotatedNode node) {
		// TODO Auto-generated method stub
		super.visitAnnotations(node);
	}

	@Override
	public void visitAssertStatement(AssertStatement statement) {
		// TODO Auto-generated method stub
		super.visitAssertStatement(statement);
	}

	@Override
	public void visitBlockStatement(BlockStatement block) {
		// TODO Auto-generated method stub
		super.visitBlockStatement(block);
	}

	@Override
	public void visitBreakStatement(BreakStatement statement) {
		// TODO Auto-generated method stub
		super.visitBreakStatement(statement);
	}

	@Override
	public void visitCaseStatement(CaseStatement statement) {
		// TODO Auto-generated method stub
		super.visitCaseStatement(statement);
	}

	@Override
	public void visitCatchStatement(CatchStatement statement) {
		// TODO Auto-generated method stub
		super.visitCatchStatement(statement);
	}

	@Override
	public void visitClass(ClassNode node) {
		this.classNode = node;
		super.visitClass(node);
	}

	@Override
	protected void visitClassCodeContainer(Statement code) {
		// TODO Auto-generated method stub
		super.visitClassCodeContainer(code);
	}

	@Override
	public void visitConstructor(ConstructorNode node) {
		// TODO Auto-generated method stub
		super.visitConstructor(node);
	}

	@Override
	protected void visitConstructorOrMethod(MethodNode node,
			boolean isConstructor) {
		// TODO Auto-generated method stub
		super.visitConstructorOrMethod(node, isConstructor);
	}

	@Override
	public void visitContinueStatement(ContinueStatement statement) {
		// TODO Auto-generated method stub
		super.visitContinueStatement(statement);
	}

	@Override
	public void visitDoWhileLoop(DoWhileStatement loop) {
		// TODO Auto-generated method stub
		super.visitDoWhileLoop(loop);
	}

	@Override
	public void visitExpressionStatement(ExpressionStatement statement) {
		// TODO Auto-generated method stub
		super.visitExpressionStatement(statement);
	}

	@Override
	public void visitField(FieldNode node) {
		super.visitField(node);
	}

	@Override
	public void visitForLoop(ForStatement forLoop) {
		// TODO Auto-generated method stub
		super.visitForLoop(forLoop);
	}

	@Override
	public void visitIfElse(IfStatement ifElse) {
		// TODO Auto-generated method stub
		super.visitIfElse(ifElse);
	}

	@Override
	public void visitMethod(MethodNode node) {
		// TODO Auto-generated method stub
		super.visitMethod(node);
	}

	@Override
	public void visitProperty(PropertyNode node) {
		super.visitProperty(node);
	}

	@Override
	public void visitReturnStatement(ReturnStatement statement) {
		// TODO Auto-generated method stub
		super.visitReturnStatement(statement);
	}

	@Override
	protected void visitStatement(Statement statement) {
		// TODO Auto-generated method stub
		super.visitStatement(statement);
	}

	@Override
	public void visitSwitch(SwitchStatement statement) {
		// TODO Auto-generated method stub
		super.visitSwitch(statement);
	}

	@Override
	public void visitSynchronizedStatement(SynchronizedStatement statement) {
		// TODO Auto-generated method stub
		super.visitSynchronizedStatement(statement);
	}

	@Override
	public void visitThrowStatement(ThrowStatement statement) {
		// TODO Auto-generated method stub
		super.visitThrowStatement(statement);
	}

	@Override
	public void visitTryCatchFinally(TryCatchStatement statement) {
		// TODO Auto-generated method stub
		super.visitTryCatchFinally(statement);
	}

	@Override
	public void visitWhileLoop(WhileStatement loop) {
		// TODO Auto-generated method stub
		super.visitWhileLoop(loop);
	}

	@Override
	public void visitArgumentlistExpression(ArgumentListExpression ale) {
		// TODO Auto-generated method stub
		super.visitArgumentlistExpression(ale);
	}

	@Override
	public void visitArrayExpression(ArrayExpression expression) {
		// TODO Auto-generated method stub
		super.visitArrayExpression(expression);
	}

	@Override
	public void visitAttributeExpression(AttributeExpression expression) {
		// TODO Auto-generated method stub
		super.visitAttributeExpression(expression);
	}

	@Override
	public void visitBinaryExpression(BinaryExpression expression) {
		// TODO Auto-generated method stub
		super.visitBinaryExpression(expression);
	}

	@Override
	public void visitBitwiseNegationExpression(
			BitwiseNegationExpression expression) {
		// TODO Auto-generated method stub
		super.visitBitwiseNegationExpression(expression);
	}

	@Override
	public void visitBooleanExpression(BooleanExpression expression) {
		// TODO Auto-generated method stub
		super.visitBooleanExpression(expression);
	}

	@Override
	public void visitCastExpression(CastExpression expression) {
		// TODO Auto-generated method stub
		super.visitCastExpression(expression);
	}

	@Override
	public void visitClassExpression(ClassExpression expression) {
		// TODO Auto-generated method stub
		super.visitClassExpression(expression);
	}

	@Override
	public void visitClosureExpression(ClosureExpression expression) {
		System.out.println(expression);
		super.visitClosureExpression(expression);
	}

	@Override
	public void visitClosureListExpression(ClosureListExpression cle) {
		// TODO Auto-generated method stub
		super.visitClosureListExpression(cle);
	}

	@Override
	public void visitConstantExpression(ConstantExpression expression) {
		// TODO Auto-generated method stub
		super.visitConstantExpression(expression);
	}

	@Override
	public void visitConstructorCallExpression(ConstructorCallExpression call) {
		// TODO Auto-generated method stub
		super.visitConstructorCallExpression(call);
	}

	@Override
	public void visitDeclarationExpression(DeclarationExpression expression) {
		// TODO Auto-generated method stub
		super.visitDeclarationExpression(expression);
	}

	@Override
	public void visitFieldExpression(FieldExpression expression) {
		// TODO Auto-generated method stub
		super.visitFieldExpression(expression);
	}

	@Override
	public void visitGStringExpression(GStringExpression expression) {
		// TODO Auto-generated method stub
		super.visitGStringExpression(expression);
	}

	@Override
	public void visitListExpression(ListExpression expression) {
		// TODO Auto-generated method stub
		super.visitListExpression(expression);
	}

	@Override
	protected void visitListOfExpressions(List list) {
		// TODO Auto-generated method stub
		super.visitListOfExpressions(list);
	}

	@Override
	public void visitMapEntryExpression(MapEntryExpression expression) {
		// TODO Auto-generated method stub
		super.visitMapEntryExpression(expression);
	}

	@Override
	public void visitMapExpression(MapExpression expression) {
		// TODO Auto-generated method stub
		super.visitMapExpression(expression);
	}

	@Override
	public void visitMethodCallExpression(MethodCallExpression call) {
		// TODO Auto-generated method stub
		super.visitMethodCallExpression(call);
	}

	@Override
	public void visitMethodPointerExpression(MethodPointerExpression expression) {
		// TODO Auto-generated method stub
		super.visitMethodPointerExpression(expression);
	}

	@Override
	public void visitNotExpression(NotExpression expression) {
		// TODO Auto-generated method stub
		super.visitNotExpression(expression);
	}

	@Override
	public void visitPostfixExpression(PostfixExpression expression) {
		// TODO Auto-generated method stub
		super.visitPostfixExpression(expression);
	}

	@Override
	public void visitPrefixExpression(PrefixExpression expression) {
		// TODO Auto-generated method stub
		super.visitPrefixExpression(expression);
	}

	@Override
	public void visitPropertyExpression(PropertyExpression expression) {
		super.visitPropertyExpression(expression);
	}

	@Override
	public void visitRangeExpression(RangeExpression expression) {
		// TODO Auto-generated method stub
		super.visitRangeExpression(expression);
	}

	@Override
	public void visitRegexExpression(RegexExpression expression) {
		// TODO Auto-generated method stub
		super.visitRegexExpression(expression);
	}

	@Override
	public void visitShortTernaryExpression(ElvisOperatorExpression expression) {
		// TODO Auto-generated method stub
		super.visitShortTernaryExpression(expression);
	}

	@Override
	public void visitSpreadExpression(SpreadExpression expression) {
		// TODO Auto-generated method stub
		super.visitSpreadExpression(expression);
	}

	@Override
	public void visitSpreadMapExpression(SpreadMapExpression expression) {
		// TODO Auto-generated method stub
		super.visitSpreadMapExpression(expression);
	}

	@Override
	public void visitStaticMethodCallExpression(StaticMethodCallExpression call) {
		// TODO Auto-generated method stub
		super.visitStaticMethodCallExpression(call);
	}

	@Override
	public void visitTernaryExpression(TernaryExpression expression) {
		// TODO Auto-generated method stub
		super.visitTernaryExpression(expression);
	}

	@Override
	public void visitTupleExpression(TupleExpression expression) {
		// TODO Auto-generated method stub
		super.visitTupleExpression(expression);
	}

	@Override
	public void visitUnaryMinusExpression(UnaryMinusExpression expression) {
		// TODO Auto-generated method stub
		super.visitUnaryMinusExpression(expression);
	}

	@Override
	public void visitUnaryPlusExpression(UnaryPlusExpression expression) {
		// TODO Auto-generated method stub
		super.visitUnaryPlusExpression(expression);
	}

	@Override
	public void visitVariableExpression(VariableExpression expression) {
		// TODO Auto-generated method stub
		super.visitVariableExpression(expression);
	}

	@Override
	protected SourceUnit getSourceUnit() {
		return this.sourceUnit;
	}

}
