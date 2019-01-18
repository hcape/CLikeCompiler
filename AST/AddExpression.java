package AST;

import Type.*;
import Semantic.*;
import Temp.*;

public class AddExpression extends Expression
{
    public Expression e1;
    public Expression e2;

    public AddExpression(Expression e, Expression d)
	{
        this.e1 = e;
        this.e2 = d;
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
        return this.e1.getLine(); 
    }

    public int getOffset()
    {
        return this.e1.getOffset();
    }

}