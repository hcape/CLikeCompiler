package AST;

import Type.*;
import Semantic.*;
import Temp.*;

public class FunctionDeclaration extends ASTNode
{
    public TypeNode ct;
    public Identifier i;
    public FormalParameterList fp;

    public FunctionDeclaration(TypeNode comp, Identifier id, FormalParameterList form)
	{
        this.ct = comp;
        this.i = id;
        this.fp = form;
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