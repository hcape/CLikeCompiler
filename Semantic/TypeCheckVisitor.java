package Semantic;

import Environment.*;
import AST.*;
import Type.*;

public class TypeCheckVisitor extends TypeVisitor
{

    Environment<String, FunctionDeclaration> fEnv = new ListEnvironment<String,FunctionDeclaration>();
    //ListEnvironment<String, FunctionDeclaration> fEnv = new ListEnvironment<String,FunctionDeclaration>();
    //ListEnvironment<String, Type> vEnv = new ListEnvironment<String,Type>(); 
    Environment<String, Type> vEnv = new ListEnvironment<String,Type>();

    String currentFunc;
    Type currentReturnType;

	public Type visit(Program p) throws SemanticException
	{
		int functionCount = p.getFunctionCount();
        
        if(functionCount == 0)
        {
            throw new SemanticException("Program must have at least one function", 0, 0);
        }

		for (int i=0;i<functionCount;i++)
		{
			Function f = p.getFunction(i);
            if(fEnv.inCurrentScope(f.fd.i.s)){
                throw new SemanticException("Program already declared", f.fd.getLine(), f.fd.getOffset());
            }
            fEnv.add(f.fd.i.s, f.fd);
            //populate the function environment before evaluating function bodies
        }
        
        FunctionDeclaration fd = fEnv.lookup("main");
        //System.out.print("fenv:" + fEnv.toString());
        if(fd == null)
        {
            throw new SemanticException("Program must have at least one main function", 0, 0);
        }
        Type t = fd.ct.typeAccept(this);
        if(!(t instanceof VoidType))
        {
            throw new SemanticException("main must have type void", fd.ct.getLine(), fd.ct.getOffset());
        }

        for (int i=0;i<functionCount;i++)
		{
			Function f = p.getFunction(i);
            f.typeAccept(this);
        }

        return null;
    }
    
    public Type visit(Function f) throws SemanticException
	{
        this.vEnv.beginScope();
        f.fd.typeAccept(this);
        f.fb.typeAccept(this);
        this.vEnv.endScope();
        return null;
    }
    
	public Type visit(FunctionDeclaration f) throws SemanticException
	{
        Type ft = f.ct.typeAccept(this);
        this.currentReturnType = ft;

        //System.out.print(fEnv.toString());
        int functionCount = f.fp.getParameterCount();
        if(f.i.s.equals("main")){
            if(functionCount != 0){
                throw new SemanticException("main shouldn't have parameters", f.getLine(), f.getOffset());
            }
        }

		for (int i=0;i<functionCount;i++)
		{
			FormalParameter fp = f.fp.getParameter(i);
            Type t = fp.typeAccept(this);
            if(t instanceof VoidType){
                throw new SemanticException("Cannot decalre void parameters", fp.getLine(), fp.getOffset());
            }
            if(this.vEnv.inCurrentScope(fp.i.s)){
                throw new SemanticException("Variable already declared in function declaration", fp.getLine(), fp.getOffset());
            }
            this.vEnv.add(fp.i.s, t);
        }
        return null;
    }
    
    public Type visit(FormalParameter fp) throws SemanticException
	{
       // System.out.print(vEnv.toString());
        return fp.ct.typeAccept(this);
    }
    
    public	Type visit(FunctionBody f) throws SemanticException
	{
		int variableCount = f.vdl.getVariableCount();
		for (int i=0;i<variableCount;i++)
		{
			VariableDeclaration v = f.vdl.getVariable(i);
            Type t = v.typeAccept(this);
            if(this.vEnv.lookup(v.i.s)!=null){
                throw new SemanticException("Variable already declared in function", v.getLine(), v.getOffset());
            }
            this.vEnv.add(v.i.s, t);
        }
		int statementCount = f.sl.getStatementCount();
		
		for (int i=0;i<statementCount;i++)
		{
			Statement s = f.sl.getStatement(i);
			if(s!=null)
			{
				s.typeAccept(this);
			}
        }
        return null;
	}

    public Type visit(VariableDeclaration v) throws SemanticException
	{
        //int x
       // v.i.typeAccept(this);
       Type t = v.ct.typeAccept(this);

        if(t instanceof VoidType)
        {
            throw new SemanticException("No void type variables", v.getLine(), v.getOffset());
        }
        return t;
	}
    
    public Type visit(Declaration d) throws SemanticException
	{

        Type t = this.vEnv.lookup(d.i.s);
        if (t == null){
            throw new SemanticException("variable doesnt exist in scope", d.getLine(), d.getOffset());
        }
		if(d.eb == null)
		{
            return t;   
        }
        else{
            if(t instanceof ArrayType)
            {
                ArrayType at = (ArrayType) t;
                Type ty = d.eb.typeAccept(this);
                if(!(ty instanceof IntegerType))
                {
                    throw new SemanticException("array indexed by not int", d.getLine(), d.getOffset());
                }
                return at.t;
            }
            return t;
        }
	}

    public Type visit(AddExpression e) throws SemanticException
    {
        Type t1 = e.e1.typeAccept(this);
        Type t2 = e.e2.typeAccept(this);
        if(t2 instanceof IntegerType && t1 instanceof IntegerType)
        {
            return new IntegerType();
        }
        else if(t2 instanceof FloatType && t1 instanceof FloatType)
        {
            return new FloatType();
        }
        else if(t2 instanceof CharType && t1 instanceof CharType)
        {
            return new CharType();
        }
        else if(t2 instanceof StringType && t1 instanceof StringType)
        {
            return new StringType();
        }
        else throw new SemanticException("Bad types for add operator", e.getLine(), e.getOffset()); 
    }

    public Type visit (SubtractExpression e) throws SemanticException
    {
        Type t1 = e.e1.typeAccept(this);
        Type t2 = e.e2.typeAccept(this);

        if(t1.getClass().equals(t2.getClass())){
            if(t2 instanceof IntegerType)
            {
                return new IntegerType();
            }
            else if(t2 instanceof FloatType)
            {
                return new FloatType();
            }
            else if(t2 instanceof CharType)
            {
                return new CharType();
            }
            else throw new SemanticException("Bad types for subtract operator", e.getLine(), e.getOffset());
        }
        else throw new SemanticException("Bad types for subtract operator", e.getLine(), e.getOffset());
    }

    public Type visit (MultExpression e) throws SemanticException
    {
        Type t1 = e.e1.typeAccept(this);
        Type t2 = e.e2.typeAccept(this);

        if(t1.getClass().equals(t2.getClass())){
            if(t2 instanceof IntegerType)
            {
                return new IntegerType();
            }
            else if(t2 instanceof FloatType)
            {
                return new FloatType();
            }
            else throw new SemanticException("Bad types for mult operator", e.getLine(), e.getOffset());
        }
        else throw new SemanticException("Bad types for mult operator", e.getLine(), e.getOffset()); 
    }

    public Type visit (LessThanExpression e) throws SemanticException
    {
        Type t1 = e.e1.typeAccept(this);
        Type t2 = e.e2.typeAccept(this);

        if(t1.getClass().equals(t2.getClass())){
            if(!(t2 instanceof VoidType))
            {
                return new BooleanType();
            }
            else throw new SemanticException("Bad types for less than operator", e.getLine(), e.getOffset());
        }
        else throw new SemanticException("Bad types for less than operator", e.getLine(), e.getOffset()); 
    }

    public Type visit (EqualityExpression e) throws SemanticException
    {
        Type t1 = e.e1.typeAccept(this);
        Type t2 = e.e2.typeAccept(this);

        if(t1.getClass().equals(t2.getClass())){
            if(!(t2 instanceof VoidType))
            {
                return new BooleanType();
            }
            else throw new SemanticException("Bad types for == operator", e.getLine(), e.getOffset());
        }
        else throw new SemanticException("Bad types for == operator", e.getLine(), e.getOffset()); 
    }

    public Type visit (IfStatement s) throws SemanticException
    {
        Type t1 = s.e.typeAccept(this);

        if(!(t1 instanceof BooleanType))
        {
            throw new SemanticException("If expression not a bool", s.getLine(), s.getOffset());
        }

        s.b.typeAccept(this);
        if(s.el != null)
        {
            s.el.typeAccept(this);
        }

        return null;
    }

    public Type visit (WhileStatement s) throws SemanticException
    {
        Type t1 = s.e.typeAccept(this);

        if(!(t1 instanceof BooleanType))
        {
            throw new SemanticException("While expression not a bool", s.getLine(), s.getOffset());
        }

        s.b.typeAccept(this);

        return null;
    }

    public Type visit (PrintlnStatement s) throws SemanticException
    {
        Type t1 = s.e.typeAccept(this);

        if(t1 instanceof VoidType)
        {
            throw new SemanticException("Println cannot print void", s.getLine(), s.getOffset());
        }

        return null;
    }

    public Type visit (PrintStatement s) throws SemanticException
    {
        Type t1 = s.e.typeAccept(this);

        if(t1 instanceof VoidType)
        {
            throw new SemanticException("Print cannot print void", s.getLine(), s.getOffset());
        }

        return null;
    }

    public Type visit (ParenExpression e) throws SemanticException
    {
        if(e.e !=null){
           return  e.e.typeAccept(this);
        }
        return null;
    }

    public Type visit(Block b) throws SemanticException
	{
		int statementCount = b.sl.getStatementCount();
        this.vEnv.beginScope();
		
		for (int i=0;i<statementCount;i++)
		{
			Statement s = b.sl.getStatement(i);
			if(s!=null){
				s.typeAccept(this);
            }
        }
        this.vEnv.endScope();
        return null;
    }
    
    public Type visit(TypeNode t) throws SemanticException
	{
        return t.t;
    }
    
	public Type visit(FunctionCall f) throws SemanticException
	{
        
        FunctionDeclaration d = fEnv.lookup(f.i.s);
        //System.out.print(fEnv.toString());
        if(d == null){
            throw new SemanticException("no function by that name", f.getLine(), f.getOffset());
        }

        if(f.exl.getExpressionCount() != d.fp.getParameterCount()){
            throw new SemanticException("improper number of function parameters", f.getLine(), f.getOffset());    
        }

		int expressionCount = f.exl.getExpressionCount();
		
		for (int i=0;i<expressionCount;i++)
		{
            Expression s = f.exl.getExpression(i);
            FormalParameter fp = d.fp.getParameter(i);
			if(s!=null)
			{
                Type t1 = s.typeAccept(this);
                Type t2 = fp.typeAccept(this);

                if(t1 != null && t2!=null){
                    if(!(t1.getClass().equals(t2.getClass()))){
                        throw new SemanticException("wrong type on parameter " + (i+1), f.getLine(), f.getOffset());
                    }
                }
			}
        }
        return d.ct.t;
	}

    public Type visit(ReturnStatement r) throws SemanticException
	{
        if(r.e == null && !(currentReturnType instanceof VoidType))
        {
            throw new SemanticException("returning void for a non void function", r.getLine(), r.getOffset());
        }
        
        if(r.e != null)
		{
            Type t = r.e.typeAccept(this);
            if(!(currentReturnType.getClass().equals(t.getClass())))
            {
                System.out.print(currentReturnType + " " + t);
                throw new SemanticException("function return type doesn't match", r.getLine(), r.getOffset());
            }
            return t;
        }
        return null;

    }

    public Type visit(ExpressionStatement e) throws SemanticException
	{
		if(e.e != null) // ??? i shouldnt have to do this
		{
			return e.e.typeAccept(this);
        }
        return null;
    }
    
    public Type visit(AssignmentStatement a) throws SemanticException
	{
        Type t = this.vEnv.lookup(a.i.s);
        if(t == null)
        {
            throw new SemanticException("assigning to variable without declaration", a.getLine(), a.getOffset());
        }
        
        Type t2 = a.e.typeAccept(this); 
        
        if(a.eb == null)
        {
            if(!(t.getClass().equals(t2.getClass())))
            {
                throw new SemanticException("assignment type doesn't match variable type", a.getLine(), a.getOffset());
            }
            return t2;
        }
        else
		{
            Type ti  = a.eb.typeAccept(this);
            ArrayType ta = (ArrayType) t;
            if(!(ti instanceof IntegerType))
            {
                throw new SemanticException("array needs integer index", a.getLine(), a.getOffset());
            }
            if(!(ta.t.getClass().equals(t2.getClass())))
            {
                throw new SemanticException("assignment type doesn't match variable type", a.getLine(), a.getOffset());
            }
        }
        return t;
	}
	

    public Type visit(Identifier id)
	{
        Type t = this.vEnv.lookup(id.s);
        return t;
	}
    
    public Type visit(IntegerLiteral i)
	{
		return new IntegerType();
	}
	
	public  Type  visit(StringLiteral s)
	{
		return new StringType();
	}

	public  Type  visit(FloatLiteral s)
	{
        return new FloatType();
    }

	public  Type  visit(BooleanLiteral s)
	{
		return new BooleanType();
	}

	public  Type  visit(CharacterLiteral s)
	{
		return new CharType();
	}

}
