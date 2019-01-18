package Temp;

import Type.*;



public class Temp
{
	int number;
    Type type;
    Type arrayType;
    String stringVal;
    
    public Temp()
	{
		this.number = 0;
        this.type = null;
        this.arrayType = null;
    }
    public Temp(int i, Type t)
	{
        this.number = i;
        this.type = t;
        this.arrayType = null;
    }
    public Temp(int i, Type t, Type t2)
	{
        this.number = i;
        this.type = t;
        this.arrayType = t2;
    }

    public Temp(int i, Type t, String t2)
	{
        this.number = i;
        this.type = t;
        this.stringVal = t2;
    }

    public String GetType()
    {
        if(this.type instanceof IntegerType){
            return "I";
        }
        else if(this.type instanceof CharType){
            return "C";
        }
        else if(this.type instanceof FloatType){
            return "F";
        }
        else if(this.type instanceof StringType){
            return "U";
        }
        else if(this.type instanceof BooleanType){
            return "Z";
        }
        else if(this.type instanceof VoidType){
            return "V";
        }
            else if(this.arrayType instanceof IntegerType)
            {
                return "AI";
            }
            else if(this.arrayType instanceof CharType)
            {
                return "AC";
            }
            else if(this.arrayType instanceof BooleanType)
            {
                return "AZ";
            }
            else if(this.arrayType instanceof FloatType)
            {
                return "AF";
            }
            else if(this.arrayType instanceof StringType)
            {
                return "AU";
            }
        else{
            return "error";
        }
    }

    public String GetJType()
    {
        if(this.type instanceof IntegerType){
            return "i";
        }
        else if(this.type instanceof CharType){
            return "i";
        }
        else if(this.type instanceof FloatType){
            return "f";
        }
        else if(this.type instanceof StringType){
            return "a";
        }
        else if(this.type instanceof BooleanType){
            return "i";
        }
            else if(this.arrayType instanceof IntegerType)
            {
                return "a";
            }
            else if(this.arrayType instanceof CharType)
            {
                return "a";
            }
            else if(this.arrayType instanceof BooleanType)
            {
                return "a";
            }
            else if(this.arrayType instanceof FloatType)
            {
                return "a";
            }
            else if(this.arrayType instanceof StringType)
            {
                return "a";
            }
        else{
            return "error";
        }
    }

    public String GetJTypeUpper(){
            if(this.type instanceof IntegerType){
                 return "I";
            }
            else if(this.type instanceof CharType){
                return "C";
            }
            else if(this.type instanceof FloatType){
                return "F";
            }
            else if(this.type instanceof StringType){
                return "Ljava/lang/String;";
            }
            else if(this.type instanceof BooleanType){
                return "Z";
            }
            else if(this.type instanceof ArrayType){
                if(this.arrayType instanceof IntegerType){
                    return "[I";
                }
                else if(this.arrayType instanceof CharType){
                    return "[C";
                }
                else if(this.arrayType instanceof FloatType){
                    return "[F";
                }
                else if(this.arrayType instanceof StringType){
                    return "[Ljava/lang/String;";
                }
                else if(this.arrayType instanceof BooleanType){
                    return "[Z";
                }
            }
            else{
                return "V";
            }
    
    return "V";
    }
}