package AST;

import Type.*;
import Semantic.*;
import Temp.*;

public class Function extends ASTNode
{
    public FunctionDeclaration fd;
    public FunctionBody fb;

    public Function(FunctionDeclaration funcd, FunctionBody funcb)
	{
        this.fd = funcd;
        this.fb = funcb;
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