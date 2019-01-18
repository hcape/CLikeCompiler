package AST;

import Type.*;
import java.util.ArrayList;
import java.util.List;
import Semantic.*;
import Temp.*;

public class Program extends ASTNode
{
    List<Function> funcList;
    
    public Program()
    {
        funcList = new ArrayList<Function>();
    }

    public void addElement(Function f)
    {
        this.funcList.add(f);
    }

    public int getFunctionCount()
    {
        return this.funcList.size();
    }

    public Function getFunction(int i)
    {
        return this.funcList.get(i);
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