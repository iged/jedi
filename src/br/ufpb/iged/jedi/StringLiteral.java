
package br.ufpb.iged.jedi;

import org.antlr.runtime.Token;

public class StringLiteral extends Expr 
{
    private Token t;

    public StringLiteral(Token t)
    {
        this.t = t;
    }
}
