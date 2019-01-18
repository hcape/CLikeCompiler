package AST;

import Type.*;
import Semantic.*;
import Temp.*;
public class TypeNode extends ASTNode
{
    public Type t;
    public int l;
    public int o;

    public TypeNode(Type ty, int line, int offset)
    {   
        this.t = ty;
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