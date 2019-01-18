package AST;

import Type.*;
import Semantic.*;
import Temp.*;

public class Declaration extends Expression
{
    public Identifier i;
    public Expression eb;

    public Declaration(Identifier id, Expression e1)
	{
        this.i = id;
        this.eb = e1;
	}
    public void accept(Visitor v)
    {
        v.visit(this);
    }
    public Type typeAccept(TypeVisitor v) throws SemanticException
    {
       return v.visit(this);
    }
    public Temp tempAccept(TempVisitor v)
    {
        return v.visit(this);
    }
    public int getLine()
    {
        return this.i.getLine(); 
    }
    
    public int getOffset()
    {
        return this.i.getOffset();
    }
}
