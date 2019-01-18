package AST;

import Type.*;
import java.util.ArrayList;
import java.util.List;
import Semantic.*;
import Temp.*;

public class FormalParameterList
{
    List<FormalParameter> fpl; 
    
    public FormalParameterList()
    {
        this.fpl = new ArrayList<FormalParameter>();
    }

    public void addFormalParameter(FormalParameter fp)
    {
        this.fpl.add(fp);
    }

    public int getParameterCount()
    {
        return this.fpl.size();
    }

    public FormalParameter getParameter(int i)
    {
        return this.fpl.get(i);
    }
}