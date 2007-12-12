import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;


public class Test_001 {

    public static void main(String args[]) throws IOException {
        specLexer lex = new specLexer(new ANTLRFileStream("C:\\workspace.europa\\spec\\input\\test_001.spec", "UTF-8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        specParser g = new specParser(tokens);
        try {
            g.specUnit();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}