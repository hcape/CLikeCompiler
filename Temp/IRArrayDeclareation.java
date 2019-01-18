package Temp;

import java.util.ArrayList;
import java.util.List;
import Temp.IRLabel;
import Type.*;
import AST.*;

public class IRArrayDeclareation extends IRInstruction
{
   
    public IRArrayDeclareation(Temp dest, Type t, IntegerLiteral i)
    {
        this.instructions = new ArrayList<String>();

        String prefix;
        if(t instanceof IntegerType){
            prefix = "int";
        }
        else if(t instanceof CharType){
            prefix = "char";
        }
        else if(t instanceof FloatType){
            prefix = "float";
        } 
        else if(t instanceof BooleanType){
            prefix = "boolean";
        }
        else if(t instanceof StringType){
            prefix = "java/lang/String";
        }

        else{
            prefix = "error";
        }

        //String ir = "T" + dest.number + ":= NEWARRAY " + prefix +" "+ i.i + ";";
        this.instructions.add("ldc " +i.i);
        this.instructions.add("newarray " + prefix);
        this.instructions.add("astore " + dest.number);
    }
}