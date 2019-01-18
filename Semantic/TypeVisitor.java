package Semantic;

import AST.*;
import Type.*;

public abstract class TypeVisitor
{
	public abstract Type visit (AddExpression e) throws SemanticException;
	//public Type visit (ArrayType a) throws SemanticException;
	//public Type visit (ArrayAssignment s) throws SemanticException;
//	public Type visit (ArrayReference a) throws SemanticException;
	public abstract Type visit (AssignmentStatement s) throws SemanticException;
	public abstract Type visit (Block b) throws SemanticException;
	public abstract Type visit (BooleanLiteral b) throws SemanticException;
	public abstract Type visit (CharacterLiteral c) throws SemanticException;
	public abstract Type visit (Declaration d) throws SemanticException;
	public abstract Type visit (EqualityExpression e) throws SemanticException;
	public abstract Type visit (ExpressionStatement e) throws SemanticException;
	public abstract Type visit (FloatLiteral f) throws SemanticException;	
	public abstract Type visit (FormalParameter p) throws SemanticException;
	public abstract Type visit (Function f) throws SemanticException;
	public abstract Type visit (FunctionBody f) throws SemanticException;
	public abstract Type visit (FunctionCall f) throws SemanticException;
	public abstract Type visit (FunctionDeclaration f) throws SemanticException;
	public abstract Type visit (Identifier i) throws SemanticException;
	//public Type visit (IdentifierValue v) throws SemanticException;
	public abstract Type visit (IfStatement i) throws SemanticException;
	public abstract Type visit (IntegerLiteral i) throws SemanticException;
	public abstract Type visit (LessThanExpression e) throws SemanticException;
	public abstract Type visit (MultExpression e) throws SemanticException;
	public abstract Type visit (ParenExpression p) throws SemanticException;
	public abstract Type visit (PrintlnStatement s) throws SemanticException;
	public abstract Type visit (PrintStatement s) throws SemanticException;	
	public abstract Type visit (Program p) throws SemanticException;
	public abstract Type visit (ReturnStatement s) throws SemanticException;
	public abstract Type visit (StringLiteral s) throws SemanticException;
	public abstract Type visit (SubtractExpression e) throws SemanticException;
	//public Type visit (Type t) throws SemanticException;
	public abstract Type visit (TypeNode t) throws SemanticException;
	public abstract Type visit (VariableDeclaration v) throws SemanticException;
	public abstract Type visit (WhileStatement s) throws SemanticException;
}
