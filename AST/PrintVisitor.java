package AST;

import AST.BooleanLiteral;
import AST.CharacterLiteral;
import AST.FloatLiteral;
import AST.FormalParameter;
import AST.StringLiteral;

public class PrintVisitor extends Visitor
{
	int indentation = 0;
	
	void printIndentation()
	{
		for(int i= 0; i<indentation; i++)
		{
			System.out.print("    ");
		}
	}
	
	public	void	visit(Program p)
	{
		int functionCount = p.getFunctionCount();
		
		for (int i=0;i<functionCount;i++)
		{

			Function f = p.getFunction(i);
			f.accept(this);
			System.out.println("");
			System.out.println("");
		}
	}

	public	void	visit(Function f)
	{
        f.fd.accept(this);
        f.fb.accept(this);
	}

	public	void	visit(FunctionDeclaration f)
	{
        f.ct.accept(this);
        System.out.print(" ");
		f.i.accept(this);
		System.out.print(" (");

		int functionCount = f.fp.getParameterCount();
		for (int i=0;i<functionCount;i++)
		{
			FormalParameter fp = f.fp.getParameter(i);
			fp.accept(this);
			if(i != functionCount - 1)
			{
				System.out.print(", ");
			}
		}
		System.out.println(")");		
	}

	public	void	visit(FormalParameter fp)
	{
		fp.ct.accept(this);
		System.out.print(" ");
		fp.i.accept(this);
	}

	public	void	visit(TypeNode t)
	{
        System.out.print(t.t.ToString());
	}

	public	void	visit(Identifier id)
	{
        System.out.print(id.s);
	}
	
	public	void	visit(FunctionBody f)
	{
        System.out.print("{");
		
		indentation++;
		int variableCount = f.vdl.getVariableCount();
		for (int i=0;i<variableCount;i++)
		{
			VariableDeclaration v = f.vdl.getVariable(i);
			System.out.println("");
			printIndentation();
			v.accept(this);
		}
		
		int statementCount = f.sl.getStatementCount();
		
		if(statementCount > 0 && variableCount > 0)
		{
			System.out.println("");
		}

		for (int i=0;i<statementCount;i++)
		{
			Statement s = f.sl.getStatement(i);
			if(s!=null)
			{
				System.out.println("");
				printIndentation();
				s.accept(this);
			}
		}

		System.out.println("");
		System.out.print("}");	
		indentation--;	
	}

	public	void	visit(VariableDeclaration v)
	{
        v.ct.accept(this);
        System.out.print(" ");
		v.i.accept(this);
		System.out.print(";");
	}

	public  void  visit(ExpressionStatement e)
	{
		if(e.e != null) // ??? i shouldnt have to do this
		{
			e.e.accept(this);
			System.out.print(";");
		}
	}

	public  void  visit(Declaration d)
	{
		d.i.accept(this);
		if(d.eb != null)
		{
			System.out.print("[");
			d.eb.accept(this);
			System.out.print("]");
		}
	}

	public  void  visit(FunctionCall f)
	{
		f.i.accept(this);
		System.out.print("(");
		int expressionCount = f.exl.getExpressionCount();
		
		for (int i=0;i<expressionCount;i++)
		{
			Expression s = f.exl.getExpression(i);
			if(s!=null)
			{
				s.accept(this);
				if(i != expressionCount -1)
				{
					System.out.print(",");
				}
			}
		}
		System.out.print(")");
	}

	public	void	visit(IfStatement v)
	{
		System.out.print("if");
		System.out.print(" (");
		v.e.accept(this);
		System.out.println(")");
		printIndentation();
		System.out.print("{");
		indentation++;
		v.b.accept(this);
		indentation--;
		System.out.println("");
		printIndentation();		
		System.out.print("}");
		
		if(v.el != null)
		{
			System.out.println("");
			printIndentation();
			System.out.println("else");
			printIndentation();
			System.out.print("{");
			indentation++;
			v.el.accept(this);
			indentation--;
			System.out.println("");
			printIndentation();			
			System.out.print("}");
		}
	}

	public	void	visit(WhileStatement v)
	{
		System.out.print("while");
		System.out.print(" (");
		if(v.e != null)
		{
			v.e.accept(this);
		}
		System.out.println(")");
		printIndentation();
		System.out.print("{");
		indentation++;
		if(v.b != null)
		{
			v.b.accept(this);
		}
		System.out.println("");
		indentation--;
		printIndentation();		
		System.out.print("}");
	}

	public	void	visit(AssignmentStatement a)
	{
		a.i.accept(this);
		if(a.eb != null)
		{
			System.out.print("[");
			a.eb.accept(this);
			System.out.print("]");
		}
		System.out.print("=");
		a.e.accept(this);
		System.out.print(";");
	}
	
	// // public  Object  visit(Identifier i)
	// // {
	// // 	System.out.print(i.name);
	// // 	return null;
	// // }
		
	// // public  Object  visit(IdentifierValue v)
	// // {
	// // 	System.out.print(v.id.name);
	// // 	return null;
	// // }
	
	public  void  visit(IntegerLiteral i)
	{
		System.out.print(i.i);
	}
	
	public  void  visit(StringLiteral s)
	{
		System.out.print(s.s);
	}

	public  void  visit(FloatLiteral s)
	{
		System.out.print(s.f);
	}

	public  void  visit(BooleanLiteral s)
	{
		System.out.print(s.b);
	}

	public  void  visit(CharacterLiteral s)
	{
		System.out.print(s.c);
	}

	public  void	visit(MultExpression m)
	{
		m.e1.accept(this);
		System.out.print ("*");
		m.e2.accept(this);
	}
	
	
	public	void	visit(AddExpression p)
	{
		p.e1.accept(this);
		System.out.print ("+");
		p.e2.accept(this);
	}
	
	public	void	visit(SubtractExpression p)
	{
		p.e1.accept(this);
		System.out.print ("-");
		p.e2.accept(this);
    }
	
	public	void	visit(LessThanExpression p)
	{
		p.e1.accept(this);
		System.out.print ("<");
		p.e2.accept(this);
	}
	
	public	void	visit(EqualityExpression p)
	{
		p.e1.accept(this);
		System.out.print ("==");
		p.e2.accept(this);
    }

	public	void	visit(PrintlnStatement p)
	{
        System.out.print("println ");
		p.e.accept(this);
		System.out.print(";");
	}

	public	void	visit(PrintStatement p)
	{
        System.out.print("print ");
		p.e.accept(this);
		System.out.print(";");
	}

	public	void	visit(ParenExpression p)
	{
		System.out.print("(");
		if(p.e != null)
		{
			p.e.accept(this);
		}
		System.out.print(")");
	}

	public	void	visit(ReturnStatement r)
	{
		System.out.print("return");
		if(r.e != null)
		{
			System.out.print(" ");
			r.e.accept(this);
		}
        System.out.print(";");
	}

	public	void	visit(Block b)
	{
		int statementCount = b.sl.getStatementCount();
		
		for (int i=0;i<statementCount;i++)
		{
			Statement s = b.sl.getStatement(i);
			if(s!=null)
			{
				System.out.println("");
				printIndentation();
				s.accept(this);
			}
		}
	}
}