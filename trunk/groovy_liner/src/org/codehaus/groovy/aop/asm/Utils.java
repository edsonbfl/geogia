package org.codehaus.groovy.aop.asm;

import org.objectweb.asm.ClassAdapter;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

public class Utils {
	
	public static byte[] convertTo6(String name) throws Exception {
		ClassReader cr = new ClassReader(name);
		System.out.println(cr.b.length);
		ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);			
		ClassAdapter ca = new ClassAdapter(cw) {
			public void visit(int version, int access, String name,
					String signature, String superName, String[] interfaces) {
				super.visit(Opcodes.V1_6, access, name, signature, superName, interfaces);
			}				
		};
		cr.accept(ca, ClassReader.EXPAND_FRAMES);
		System.out.println(cw.toByteArray().length);
		return cw.toByteArray();
	}

}
