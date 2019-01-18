package AST;

import Type.*;
import java.util.ArrayList;
import java.util.List;
import Semantic.*;
import Temp.*;

public class VariableDeclarationList
{
    List<VariableDeclaration> vdl;
    
    public VariableDeclarationList()
    {
       this.vdl = new ArrayList<VariableDeclaration>();

    }
    public void addVariable(VariableDeclaration vd)
    {
        this.vdl.add(vd);
    }

    public int getVariableCount()
    {
        return this.vdl.size();
    }

    public VariableDeclaration getVariable(int i)
    {
        return this.vdl.get(i);
    }

}