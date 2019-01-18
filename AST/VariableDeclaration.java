package AST;

import Type.*;
import Semantic.*;
import Temp.*;

public class VariableDeclaration extends ASTNode
{
    public TypeNode ct;
    public Identifier i;

    public VariableDeclaration(TypeNode comp, Identifier id)
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
        return this.i.getLine(); 
    }

    public int getOffset()
    {
        return this.i.getOffset();
    }
}