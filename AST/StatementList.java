package AST;

import Type.*;
import java.util.ArrayList;
import java.util.List;
import Semantic.*;
import Temp.*;

public class StatementList
{
    List<Statement> sl;
    
    public StatementList()
    {
       this.sl = new ArrayList<Statement>();

    }
    public void addStatement(Statement vd)
    {
        this.sl.add(vd);
    }

    public int getStatementCount()
    {
        return this.sl.size();
    }

    public Statement getStatement(int i)
    {
        return this.sl.get(i);
    }

}