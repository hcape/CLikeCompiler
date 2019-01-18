package AST;

import Type.*;
import Semantic.*;
import Temp.*;

public class IntegerLiteral extends Expression
{
    public int i;
    public int l;
    public int o;

    public IntegerLiteral(int value, int line, int offset)
	{
        this.i = value;
        this.l = line;
        this.o = offset;
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
        return this.l; 
    }

    public int getOffset()
    {
        return this.o;
    }
}