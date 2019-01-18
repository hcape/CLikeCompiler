package AST;

import Type.*;
import Semantic.*;
import Temp.*;

public class IfStatement extends Statement
{
    public Expression e;
    public Block b;
    public  Block el;

    public IfStatement(Expression e1, Block b1, Block b2)
	{
        this.e = e1;
        this.b = b1;
        this.el = b2;
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
