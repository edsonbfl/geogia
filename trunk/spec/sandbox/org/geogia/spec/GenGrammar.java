package org.geogia.spec;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.antlr.Tool;

public class GenGrammar {

	public static void main(String[] args) throws IOException {
		RandomAccessFile f = new RandomAccessFile("./src/spec.g", "r");
		byte[] buffer = new byte[(int)f.length()];
		f.readFully(buffer);
		char[] charBuffer = new String(buffer, "UTF-8").toCharArray();
		FileOutputStream fout = new FileOutputStream("./src/spec.g3");
		for (int i = 0; i < charBuffer.length; i++) {
			if(charBuffer[i] > 0x0E00) {
				String s = "\\u0" + Integer.toHexString(charBuffer[i]);				
				fout.write(s.getBytes());
			} else {
				fout.write(charBuffer[i]);
			}
		}
		fout.close();
		
		Tool tool = new Tool();
		//tool.main(null);
		tool.main(new String[]{"-o",".","./src/spec.g3"});
		//tool.main(new String[]{"-debug","-o",".","./src/spec.g3"});		
	}
	
}
