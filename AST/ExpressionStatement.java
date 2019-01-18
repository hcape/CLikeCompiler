package AST;

import Type.*;
import Semantic.*;
import Temp.*;

public class ExpressionStatement extends Statement
{
    public Expression e;

    public ExpressionStatement(Expression e1)
	{
        this.e = e1;
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

}