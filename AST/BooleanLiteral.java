package AST;
import Semantic.*;

import Type.*;
import Temp.*;

public class BooleanLiteral extends Expression
{
    public Boolean b;
    int l;
    int o;

    public BooleanLiteral(String value, int line, int offset)
	{
        if (value.equals("TRUE"))
        {
            b = true;
        }
        else b = false;

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