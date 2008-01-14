package org.codehaus.groovy.aop.asm;

import org.codehaus.groovy.aop.parser.GStaticParser;
import org.codehaus.groovy.aop.parser.codedom.GStatic;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

public class Transformer {
	
	public static void main(String[] args) throws Exception {			
			final String className = "org.codehaus.groovy.aop.Test";
			final String className2 = "org.codehaus.groovy.aop.Test$_main_closure1";
			
			byte[] bytes = Utils.convertTo6(className);
			new ClassFileWriter(bytes, className).write("output1");
			byte[] bytes2 = Utils.convertTo6(className2);
			new ClassFileWriter(bytes2, className2).write("output1");
						
			final GStaticParser gp = new GStaticParser("src/Default.gstatic");			
			GStatic gstatic = gp.compilationUnit();			
			ClassReader cr = new ClassReader(bytes);
			ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);					
			InlinerClassAdapter ca = new InlinerClassAdapter(cw, gstatic);
			ca.setResolver(gp.getResolver());
			cr.accept(ca, ClassReader.EXPAND_FRAMES);
			new ClassFileWriter(cw.toByteArray(), className).write("output");
	}

}
