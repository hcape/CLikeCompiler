package AST;

import Type.*;
import Semantic.*;
import Temp.*;

public class FormalParameter extends ASTNode
{
    public TypeNode ct;
    public  Identifier i;
    public FormalParameterList fp;

    public FormalParameter()
	{
        this.ct = null;
        this.i = null;
    }
    public FormalParameter(TypeNode comp, Identifier id)
	{
        this.ct = comp;
        this.i = id;
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
        return this.ct.getLine(); 
    }

    public int getOffset()
    {
        return this.ct.getOffset();
    }
}