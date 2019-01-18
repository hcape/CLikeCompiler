package AST;

import Type.*;
import Semantic.*;
import Temp.*;

public class ParenExpression extends Expression
{
    public Expression e;

    public ParenExpression(Expression value)
	{
        this.e = value;
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
        return this.e.getLine(); 
    }

    public int getOffset()
    {
        return this.e.getOffset();
    }
}