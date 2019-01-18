package Type;

import AST.*;

public class ArrayType extends Type
{
    public Type t;
    public IntegerLiteral i;

    public ArrayType(Type ty, IntegerLiteral il)
    {
        this.t = ty;
        this.i = il;
    }

    public String ToString()
    {
        return this.t.ToString() + "[" + this.i.i + "]";    
    }

    public boolean equals(Type t)
    {
        if(t instanceof ArrayType)
        {
            ArrayType ta = (ArrayType) t;
            return (ta.t.equals(this.t) && ta.i == this.i);
            
        }
        return false;
    }
}