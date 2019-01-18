package AST;

import Type.*;
import Semantic.*;
import Temp.*;  

public class FunctionCall extends Expression
{
    public Identifier i;
    public ExpressionList exl;

    public FunctionCall(Identifier id, ExpressionList form)
	{
        this.i = id;
        this.exl = form;
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