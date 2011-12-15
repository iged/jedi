import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import br.ufpb.iged.jedi.JediLexer;
import br.ufpb.iged.jedi.JediParser;

public class ParserTest {
    public static void main(String[] args) throws Exception {
        CharStream input = new ANTLRFileStream("teste.jedi");
        JediLexer lexer = new JediLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JediParser parser = new JediParser(tokens);

        CommonTree tree = (CommonTree) parser.prog().getTree();
        System.out.println("AST gerada pelo analisador:");
        System.out.println(tree.toStringTree());
    }
}
