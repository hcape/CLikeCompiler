package AST;

import Type.*;
import Semantic.*;
import Temp.*;

public abstract class Expression
{
	public abstract void accept (Visitor v);
	public abstract Type typeAccept (TypeVisitor v) throws SemanticException;
	public abstract Temp tempAccept(TempVisitor v);
	public abstract int getLine();
    public abstract int getOffset();
}
