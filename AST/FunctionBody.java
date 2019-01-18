package AST;

import Type.*;
import Semantic.*;
import Temp.*;

public class FunctionBody extends ASTNode
{
    public VariableDeclarationList vdl;
    public StatementList sl;

    public FunctionBody()
    {
        this.vdl = new VariableDeclarationList();
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