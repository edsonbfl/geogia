package org.codehaus.groovy.qdg.classgen;

import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.ast.PropertyNode;
import org.codehaus.groovy.ast.FieldNode;
import org.codehaus.groovy.ast.expr.ClosureExpression;
import org.codehaus.groovy.classgen.BytecodeHelper;
import org.objectweb.asm.FieldVisitor;

public class QdgClassGen extends AbstractQdgClassGen {

    private ClassNode classNode;

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

    @Override
    public void visitClosureExpression(ClosureExpression closureExpression) {
        System.out.println(closureExpression);
        super.visitClosureExpression(closureExpression);
    }

    @Override
    public void visitProperty(PropertyNode propNode) {
        // super.visitProperty(propNode);
    }
}
