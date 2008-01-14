package org.codehaus.groovy.aop.asm;

import java.io.File;
import java.io.FileOutputStream;

public class ClassFileWriter {
	
	private String className;
	private String path;
	private byte[] data;
	
	public ClassFileWriter(byte[] data, String className) {
		this.className = className;
		this.data = data;
		this.path = className.substring(0, className.lastIndexOf('.')).replace('.', '/');
	}
	
	public void write(String outDir) throws Exception {
		File dir = new File(outDir + '/' + path);
		dir.mkdirs();		
		FileOutputStream f = new FileOutputStream(outDir + '/' + className.replace('.', '/') + ".class");
		f.write(this.data);
		f.flush();
		f.close();
	}

}
