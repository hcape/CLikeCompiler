package AST;

import Type.*;
import Semantic.*;
import Temp.*;

public class ReturnStatement extends Statement
{
    public  Expression e;
    public int line;
    public int offset;

    public ReturnStatement(Expression exp, int l, int o)
	{
        this.e = exp;
        this.line = l;
        this.offset = o;
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
        return this.line; 
    }

    public int getOffset()
    {
        return this.offset; 
    }
}