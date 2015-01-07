import bhunt.erlang.parser.ErlangLexer;
import bhunt.erlang.parser.ErlangParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

public class ParseAppConfMain {


    public static void main(String[] args) throws IOException {

        InputStream stream = ParseAppConfMain.class.getResourceAsStream("app.config");

        // create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(stream);


        // create a lexer that feeds off of input CharStream
        ErlangLexer lexer = new ErlangLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        ErlangParser  parser = new ErlangParser(tokens);
//        parser.addParseListener(new ErlangListenerImpl());

        ParseTree tree = parser.forms(); // begin parsing at init rule
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
//        System.out.println(tree.toStringTree());

        System.err.println("tree");
System.err.println(tree);
        System.err.println("tree finished");


    }
}
