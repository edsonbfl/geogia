import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        specLexer lex = new specLexer(new ANTLRFileStream("C:\\workspace.europa\\spec\\input\\HPS_01.spec"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        specParser g = new specParser(tokens);//, 49153);
        try {
            g.specUnit();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}