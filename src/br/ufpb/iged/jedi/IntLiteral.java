
package br.ufpb.iged.jedi;

import org.antlr.runtime.Token;

public class IntLiteral extends Expr 
{
    private Token t;

    public IntLiteral(Token t)
    {
        this.t = t;
    }

    @Override
    public String toString()
    {
        return t.getText();
    }
}
