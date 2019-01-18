package AST;

import Type.*;

public abstract class Visitor
{
	public abstract void visit (AddExpression e);
	//public void visit (ArrayAssignment s);
	public abstract void visit (AssignmentStatement a);
	public abstract void visit (Block b);
	public abstract void visit (BooleanLiteral b);
	public abstract void visit (CharacterLiteral c);
	public abstract void visit (Declaration d);
	public abstract void visit (EqualityExpression e);
	public abstract void visit (LessThanExpression e);
	public abstract void visit (MultExpression e);
	public abstract void visit (ExpressionStatement e);
	public abstract void visit (FloatLiteral f);	
	public abstract void visit (FormalParameter fp);
	public abstract void visit (Function f);
	public abstract void visit (FunctionBody f);
	public abstract void visit (FunctionCall f);
	public abstract void visit (FunctionDeclaration f);
	public abstract void visit (Identifier i);
	//public abstract void visit (IdentifierValue v);
	public abstract void visit (IfStatement i);
	public abstract void visit (IntegerLiteral i);
	public abstract void visit (StringLiteral i);
	public abstract void visit (ParenExpression p);
	public abstract void visit (PrintlnStatement p);
	public abstract void visit (PrintStatement p);	
	public abstract void visit (Program p);
	public abstract void visit (SubtractExpression e);
	public abstract void visit (TypeNode t);
	public abstract void visit (ReturnStatement r);
	// //public void visit (VariableAssignment s);
	public abstract void visit (VariableDeclaration v);
	public abstract void visit (WhileStatement s);
}
