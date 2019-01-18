package Temp;

import AST.*;
import Type.*;

public abstract class TempVisitor
{
	public abstract Temp visit (AddExpression e) ;
	public abstract Temp visit (AssignmentStatement s) ;
	public abstract Temp visit (Block b) ;
	public abstract Temp visit (BooleanLiteral b) ;
	public abstract Temp visit (CharacterLiteral c) ;
	public abstract Temp visit (Declaration d) ;
	public abstract Temp visit (EqualityExpression e) ;
	public abstract Temp visit (ExpressionStatement e) ;
	public abstract Temp visit (FloatLiteral f) ;	
	public abstract Temp visit (FormalParameter p) ;
	public abstract Temp visit (Function f) ;
	public abstract Temp visit (FunctionBody f) ;
	public abstract Temp visit (FunctionCall f) ;
	public abstract Temp visit (FunctionDeclaration f) ;
	public abstract Temp visit (Identifier i) ;
 	public abstract Temp visit (IfStatement i) ;
	public abstract Temp visit (IntegerLiteral i) ;
	public abstract Temp visit (LessThanExpression e) ;
	public abstract Temp visit (MultExpression e) ;
	public abstract Temp visit (ParenExpression p) ;
	public abstract Temp visit (PrintlnStatement s) ;
	public abstract Temp visit (PrintStatement s) ;	
	public abstract Temp visit (Program p) ;
	public abstract Temp visit (ReturnStatement s) ;
	public abstract Temp visit (StringLiteral s) ;
	public abstract Temp visit (SubtractExpression e) ;
	public abstract Temp visit (TypeNode t) ;
	public abstract Temp visit (VariableDeclaration v) ;
	public abstract Temp visit (WhileStatement s) ;
}
