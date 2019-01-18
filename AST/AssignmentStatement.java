package AST;

import Type.*;
import Semantic.*;
import Temp.*;

public class AssignmentStatement extends Statement
{
    public Identifier i;
    public Expression eb;
    public Expression e;

    public AssignmentStatement(Identifier id, Expression e1, Expression e2)
	{
        this.i = id;
        this.eb = e1;
        this.e = e2;
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