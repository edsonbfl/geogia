package org.codehaus.groovy.qdg.classgen;

import org.codehaus.groovy.ast.ClassCodeVisitorSupport;
import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.ast.FieldNode;
import org.codehaus.groovy.ast.ModuleNode;
import org.codehaus.groovy.ast.PropertyNode;
import org.codehaus.groovy.ast.expr.BinaryExpression;
import org.codehaus.groovy.ast.expr.Expression;
import org.codehaus.groovy.ast.expr.FieldExpression;
import org.codehaus.groovy.ast.expr.VariableExpression;
import org.codehaus.groovy.ast.stmt.ExpressionStatement;
import org.codehaus.groovy.ast.stmt.ReturnStatement;
import org.codehaus.groovy.ast.stmt.Statement;
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
        TraceClassVisitor tcv = new TraceClassVisitor(cw, pw);
        cv = new CheckClassAdapter(tcv);
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
}
