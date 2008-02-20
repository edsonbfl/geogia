import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;


public class Test_001 /*extends specParser*/ {

//    public Test_001(TokenStream input) {
//		super(input);
//	}

//	@Override
//	public void emitErrorMessage(String arg0) {
//		StringBuffer s = new StringBuffer();
//		// System.out.println(arg0);
//		for(int i=0;i<arg0.length();i++) {
//			if(arg0.charAt(i)=='\\' && arg0.charAt(i+1)=='u'){
//				String e = "0x"+arg0.charAt(i+2)+arg0.charAt(i+3)+arg0.charAt(i+4)+arg0.charAt(i+5);
//				s.append((char)Integer.decode(e).intValue());
//				i=i+5;				
//			}
//			else {
//				s.append(arg0.charAt(i));
//			}
//		}
//		super.emitErrorMessage(s.toString());
//	}
	
	public static void main(String args[]) throws IOException {
        specLexer lex = new specLexer(new ANTLRFileStream("C:\\workspace.europa\\spec\\input\\test_000.spec", "UTF-8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        specParser g = new specParser(tokens);
        try {
            g.specUnit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }	
}