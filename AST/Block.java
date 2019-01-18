package AST;
import Semantic.*;

import Type.*;
import Temp.*;

public class Block extends ASTNode
{
    public StatementList sl;

    public Block()
    {
        this.sl = new StatementList();
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

}