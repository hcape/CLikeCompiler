package AST;

import Type.*;
import Semantic.*;
import Temp.*;

public class PrintlnStatement extends Statement
{
    public Expression e;

    public PrintlnStatement(Expression exp)
	{
        this.e = exp;
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