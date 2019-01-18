package AST;

import Type.*;
import java.util.ArrayList;
import java.util.List;
import Semantic.*;
import Temp.*;

public class ExpressionList
{
    List<Expression> exl; 
    
    public ExpressionList()
    {
        this.exl = new ArrayList<Expression>();
    }

    public void addExpression(Expression fp)
    {
        this.exl.add(fp);
    }
    public int getExpressionCount()
    {
        return this.exl.size();
    }

    public Expression getExpression(int i)
    {
        return this.exl.get(i);
    }
}