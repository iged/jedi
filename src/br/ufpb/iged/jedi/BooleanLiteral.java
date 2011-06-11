
package br.ufpb.iged.jedi;

import org.antlr.runtime.Token;

public class BooleanLiteral extends Expr 
{
    private Token t;

    public BooleanLiteral(Token t)
    {
        this.t = t;
    }

    @Override
    public String toString() 
    {
        if (t.getText().equals("true"))
            return "true";

        return "false";
    }
}
