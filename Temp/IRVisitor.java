package Temp;

import Environment.*;

import AST.*;
import Type.*;
import java.util.List;
import java.util.ArrayList;


public class IRVisitor extends TempVisitor
{

    ListEnvironment<String, FunctionDeclaration> fEnv = new ListEnvironment<String,FunctionDeclaration>();
    //ListEnvironment<String, Type> vEnv = new ListEnvironment<String,Type>(); 

    String currentFunc;
    Type currentReturnType;
    LabelFactory labels;
    TempFactory temps;
    IRInstructionList instr;
    String ProgName;
    boolean returned = false;

    public IRVisitor(String name)
    {
        this.ProgName = name.substring(0, name.length() - 3);
    }

	public Temp visit(Program p) 
	{
        this.instr = new IRInstructionList();
        this.instr.Add(new IRProgramName(this.ProgName));
		int functionCount = p.getFunctionCount();
        
        for (int i=0;i<functionCount;i++)
		{
            Function f = p.getFunction(i);
            this.fEnv.add(f.fd.i.s, f.fd);
        }
        for (int i=0;i<functionCount;i++)
		{
			Function f = p.getFunction(i);
            f.tempAccept(this);
        }

        this.instr.Add(new IRBoilerPlate(this.ProgName));
        this.instr.Print();
        return null;
    }
    
    public Temp visit(Function f) 
	{
        //vEnv.beginScope();
        labels = new LabelFactory();
        temps = new TempFactory();
        
        returned = false;
        IRLabel l = labels.getLabel();
        f.fd.tempAccept(this);
        
        f.fb.tempAccept(this);
        //vEnv.endScope();

        if(returned == false)
        {
            this.instr.Add(new IRReturn());
        }
        
        IRLabel le = labels.getLabel();
        this.instr.Add(le);
        System.out.println("    .limit locals "+(temps.count+1));
        this.temps.Print(l, le);
        System.out.println("    .limit stack 16");
        System.out.println("L"+l.number+":");
        this.temps.PrintAutos();

        //this.inst.Add(new IRStackSize());
        
        this.instr.Add(new IREndBracket());
        this.instr.Print();

        return null;
    }
    
	public Temp visit(FunctionDeclaration f) 
	{
        //Temp ft = f.ct.tempAccept(this);

        int functionCount = f.fp.getParameterCount();
        List<Temp> openTemps = new ArrayList<Temp>();
		for (int i=0;i<functionCount;i++)
		{
			FormalParameter fp = f.fp.getParameter(i);
            Temp t = fp.tempAccept(this);
            openTemps.add(t);
        }
        IRInstruction ir = new IRFunction(f.ct.t, f.i.s, openTemps);
        this.instr.Add(ir);

        this.instr.Print();
        
        return null;
    }
    
    public Temp visit(FormalParameter fp) 
	{
       Temp a = temps.getTemp(fp.ct.t, true);
       temps.vEnv.add(fp.i.s, a);
        return a;
    }
    
    public Temp visit(FunctionBody f) 
	{
        int variableCount = f.vdl.getVariableCount();
		int statementCount = f.sl.getStatementCount();

		for (int i=0;i<variableCount;i++)
		{
			VariableDeclaration v = f.vdl.getVariable(i);
            Temp t = v.tempAccept(this);
            //IRInstruction ir = new IRTempDeclaration(t);
            //this.instr.Add(ir);
        }
		
		for (int i=0;i<statementCount;i++)
		{
			Statement s = f.sl.getStatement(i);
			if(s!=null)
			{
				s.tempAccept(this);
			}
        }
        return null;
	}

    public Temp visit(VariableDeclaration v) 
	{
        //int x
       // v.i.typeAccept(this);
       //Temp t = v.ct.tempAccept(this);
        if(v.ct.t instanceof ArrayType)
        {
            ArrayType ta = (ArrayType) v.ct.t;
            Temp a = temps.getTemp(ta, ta.t, false);
            temps.vEnv.add(v.i.s, a);
            IRInstruction ir = new IRArrayDeclareation(a, ta.t, ta.i);
            this.instr.Add(ir);
            return a;
        }
        
        Temp a = temps.getTemp(v.ct.t, false);
        temps.vEnv.add(v.i.s, a);
        return a;
	}
    
    public Temp visit(Declaration d) 
	{

		if(d.eb == null)
		{
            return temps.vEnv.lookup(d.i.s);
        }
        else{
            Temp a = temps.vEnv.lookup(d.i.s);
            if(a.type instanceof ArrayType)
            {
                Temp ty = d.eb.tempAccept(this);
                Temp dest = temps.getTemp(a.arrayType, false);
                IRInstruction ir = new IRAssign(dest, a, ty);
                this.instr.Add(ir);
                return dest;
            }
            return null;
        }
	}

    public Temp visit(AddExpression e) 
    {
        Temp t1 = e.e1.tempAccept(this);
        Temp t2 = e.e2.tempAccept(this);
       
        Temp dest = temps.getTemp(t1.type, false);
        IRInstruction ir = new IRBinaryOp(dest, t1, t2, IRBinaryOpType.IRBinaryAdd, labels);

        this.instr.Add(ir);

        //temps.returnTemp(t1);
        //temps.returnTemp(t2);
        return dest;

    }

    public Temp visit (SubtractExpression e) 
    {
        Temp t1 = e.e1.tempAccept(this);
        Temp t2 = e.e2.tempAccept(this);
       
        Temp dest = temps.getTemp(t1.type, false);
        IRInstruction ir = new IRBinaryOp(dest, t1, t2, IRBinaryOpType.IRBinarySub, labels);

        this.instr.Add(ir);

        //temps.returnTemp(t1);
        //temps.returnTemp(t2);
        return dest;
    }

    public Temp visit (MultExpression e) 
    {
        Temp t1 = e.e1.tempAccept(this);
        Temp t2 = e.e2.tempAccept(this);
       
        Temp dest = temps.getTemp(t1.type, false);
        IRInstruction ir = new IRBinaryOp(dest, t1, t2, IRBinaryOpType.IRBinaryMult, labels);

        this.instr.Add(ir);

        //temps.returnTemp(t1);
        //temps.returnTemp(t2);
        return dest;
    }

    public Temp visit (LessThanExpression e) 
    {
        Temp t1 = e.e1.tempAccept(this);
        Temp t2 = e.e2.tempAccept(this);
       
        Temp dest = temps.getTemp(new BooleanType(), false);
        IRInstruction ir = new IRBinaryOp(dest, t1, t2, IRBinaryOpType.IRBinaryLess, labels);

        this.instr.Add(ir);

        //temps.returnTemp(t1);
        //temps.returnTemp(t2);
        return dest;
    }

    public Temp visit (EqualityExpression e) 
    {
        Temp t1 = e.e1.tempAccept(this);
        Temp t2 = e.e2.tempAccept(this);
       
        Temp dest = temps.getTemp(new BooleanType(), false);
        IRInstruction ir = new IRBinaryOp(dest, t1, t2, IRBinaryOpType.IRBinaryEq, labels);

        this.instr.Add(ir);

        //temps.returnTemp(t1);
        //temps.returnTemp(t2);
        return dest;
    }

    public Temp visit (IfStatement s) 
    {
        IRInstruction ir;
        IRLabel l1 = labels.getLabel();

        Temp t = s.e.tempAccept(this);

       // if(temps.isParamorLocal(t)){
            Temp t2 = temps.getTemp(new BooleanType(),false);
            ir = new IRAssign(t2, t);
            this.instr.Add(ir);
            t = t2;
        //}
        
        ir = new IRUnaryOp(t, t, IRUnaryOpType.IRUnaryInvert);
        this.instr.Add(ir);
        //temps.returnTemp(t);

        ir = new IRGoto(t2, l1);
        this.instr.Add(ir);
        s.b.tempAccept(this);
        
        IRLabel l2 = null;
        if(s.el != null){
            l2 = labels.getLabel();
            
            ir = new IRGoto(l2);
            this.instr.Add(ir);
        }

        this.instr.Add(l1);
        
        if(s.el != null){
            if(l2==null)
            {
                l2 = labels.getLabel();
            }
            s.el.tempAccept(this);
            this.instr.Add(l2);
        }
        
        return null;

    }

    public Temp visit (WhileStatement s) 
    {
        IRInstruction ir;
        IRLabel l0 = labels.getLabel();
        IRLabel l1 = labels.getLabel();

        this.instr.Add(l0);
        Temp t = s.e.tempAccept(this);

       // if(temps.isParamorLocal(t)){
            Temp t2 = temps.getTemp(new BooleanType(),false);
            ir = new IRAssign(t2, t);
            this.instr.Add(ir);
            t = t2;
        //}
        
        ir = new IRUnaryOp(t, t, IRUnaryOpType.IRUnaryInvert);
        this.instr.Add(ir);
        //temps.returnTemp(t);


       

        ir = new IRGoto(t2, l1);
        this.instr.Add(ir);
        s.b.tempAccept(this);
        ir = new IRGoto(l0);
        this.instr.Add(ir);
        
        this.instr.Add(l1);
        
        return null;
    }

    public Temp visit (PrintlnStatement s) 
    {
        Temp t1 = s.e.tempAccept(this);

        IRInstruction ir = new IRPrintln(t1);

        this.instr.Add(ir);

        return t1;
    }

    public Temp visit (PrintStatement s) 
    {
        Temp t1 = s.e.tempAccept(this);

        IRInstruction ir = new IRPrint(t1);

        this.instr.Add(ir);

        return t1;
    }

    public Temp visit (ParenExpression e) 
    {
        if(e.e !=null){
           return  e.e.tempAccept(this);
        }
        return null;
    }

    public Temp visit(Block b) 
	{
		int statementCount = b.sl.getStatementCount();
        //vEnv.beginScope();
		
		for (int i=0;i<statementCount;i++)
		{
			Statement s = b.sl.getStatement(i);
			if(s!=null){
				s.tempAccept(this);
            }
        }
        //vEnv.endScope();
        return null;
    }
    
    public Temp visit(TypeNode t) 
	{

        if(t.t instanceof ArrayType)
        {
            ArrayType ta = (ArrayType) t.t;
            Temp a = temps.getTemp(ta, ta.t,false);
            //temps.vEnv.add(v.i, a);
            return a;
        }
        Temp a = temps.getTemp(t.t,false);
        //temps.vEnv.add(v.i, a);
        return a;

    }
    
	public Temp visit(FunctionCall f) 
	{
        
        FunctionDeclaration d = fEnv.lookup(f.i.s);
       
        //System.out.print(fEnv.toString());
        List<Temp> openTemps = new ArrayList<Temp>();
		int expressionCount = f.exl.getExpressionCount();
		
		for (int i=0;i<expressionCount;i++)
		{
            Expression s = f.exl.getExpression(i);
			if(s!=null)
			{
                Temp t1 = s.tempAccept(this);
                openTemps.add(t1);
			}
        }
        if( d.ct.t != null && !(d.ct.t instanceof VoidType)){
            Temp dest;
            if(d.ct.t instanceof ArrayType)
            {
                ArrayType ta = (ArrayType) d.ct.t;
                dest = temps.getTemp(ta, ta.t,false);
            }
            else{
                dest = temps.getTemp(d.ct.t,false);
            }

            IRInstruction ir = new IRFunctionCall(f.i.s, this.ProgName, openTemps, dest);
            this.instr.Add(ir);
            return dest;
            
        }else{
            IRInstruction ir = new IRFunctionCall(f.i.s, this.ProgName, openTemps);
            this.instr.Add(ir);
            return null;
        }
        
	}

    public Temp visit(ReturnStatement r) 
	{
        returned = true;
        if(r.e == null)
        {
            IRInstruction ir = new IRReturn();
            this.instr.Add(ir);
            return null;
        }
        else
		{
            Temp t = r.e.tempAccept(this);
            IRInstruction ir = new IRReturn(t);
            this.instr.Add(ir);
            return null;
        }
    }

    public Temp visit(ExpressionStatement e) 
	{
		if(e.e != null) // ??? i shouldnt have to do this
		{
			return e.e.tempAccept(this);
        }
        return null;
    }
    
    public Temp visit(AssignmentStatement a) 
	{
        Temp t = temps.vEnv.lookup(a.i.s);
        Temp t2 = a.e.tempAccept(this); 
        
        if(a.eb != null)
        {
            Temp ti  = a.eb.tempAccept(this);
            IRInstruction ir = new IRAssign(t, ti, t2, true);
            this.instr.Add(ir);
        }
        else{
            IRInstruction ir = new IRAssign(t, t2);
            this.instr.Add(ir);
        }
        return t;
	}
	

    public Temp visit(Identifier id)
	{
        Temp t = temps.vEnv.lookup(id.s);
        return t;
	}
    
    public Temp visit(IntegerLiteral i)
	{
        Temp dest = temps.getTemp(new IntegerType(),false);
        IRInstruction ir = new IRAssign(dest, i.i);
        this.instr.Add(ir);
		return dest;
	}
	
	public  Temp  visit(StringLiteral s)
	{
		Temp dest = temps.getTemp(new StringType(), s.s,false);
        IRInstruction ir = new IRAssign(dest, s.s);
        this.instr.Add(ir);
		return dest;
	}

	public  Temp  visit(FloatLiteral s)
	{
		Temp dest = temps.getTemp(new FloatType(),false);
        IRInstruction ir = new IRAssign(dest, s.f);
        this.instr.Add(ir);
		return dest;
    }

	public  Temp  visit(BooleanLiteral s)
	{
		Temp dest = temps.getTemp(new BooleanType(),false);
        IRInstruction ir = new IRAssign(dest, s.b);
        this.instr.Add(ir);
		return dest;
	}

	public  Temp  visit(CharacterLiteral s)
	{
		Temp dest = temps.getTemp(new CharType(),false);
        IRInstruction ir = new IRAssign(dest, s.c);
        this.instr.Add(ir);
		return dest;
	}

}
