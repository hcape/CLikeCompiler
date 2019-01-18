package AST;
import Semantic.*;

import Type.*;
import Temp.*;


public abstract class ASTNode
{
    public abstract void accept (Visitor v);
    public abstract Type typeAccept (TypeVisitor v) throws SemanticException;
    public abstract Temp tempAccept(TempVisitor v);
}