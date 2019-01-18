package AST;
import Semantic.*;

import Type.*;

public class ArrayAssignment extends Statement
{
    Identifier i;
    Expression eb;
    Expression e;

    public ArrayAssignment(Identifier id, Expression e1, Expression e2)
	{
        this.i = id;
        this.eb = e1;
        this.e = e2;
	}
    void accept(Visitor v)
    {
        v.Visit(this);
    }
}