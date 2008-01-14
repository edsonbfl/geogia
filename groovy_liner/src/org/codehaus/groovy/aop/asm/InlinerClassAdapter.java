package org.codehaus.groovy.aop.asm;

import org.codehaus.groovy.aop.parser.ClassTypeResolver;
import org.codehaus.groovy.aop.parser.codedom.GStatic;
import org.objectweb.asm.ClassAdapter;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

public class InlinerClassAdapter extends ClassAdapter {

	private String owner;
	private GStatic gstatic;
	private ClassTypeResolver resolver;

	public void setResolver(ClassTypeResolver resolver) {
		this.resolver = resolver;
	}

	public InlinerClassAdapter(ClassVisitor cv, GStatic gstatic) {
		super(cv);
		this.gstatic = gstatic; 
	}
	
	@Override
	public void visit(int version, int access, String name, String signature,
			String superName, String[] interfaces) {
		this.owner = name;
		super.visit(version, access, name, signature, superName, interfaces);
	}

	@Override
	public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
		MethodVisitor mv = super.visitMethod(access, name, desc, signature, exceptions);
		MethodCallAdapter mca = new MethodCallAdapter(owner, access, name, desc, mv, gstatic);
		mca.setResolver(this.resolver);
		return mca;
	}	

}
