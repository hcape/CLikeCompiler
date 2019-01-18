package Temp;

import java.util.ArrayList;
import java.util.List;
import Type.*;

public class IRReturn extends IRInstruction
{
   
    public IRReturn()
    {
        this.instructions = new ArrayList<String>();
        //String i = "RETURN;";
        String i = "return";
        this.instructions.add(i);
    }

    public IRReturn(Temp a)
    {
        this.instructions = new ArrayList<String>();
        //String i = "RETURN T"+a.number+";";

        if(a.type instanceof IntegerType){
            this.instructions.add("iload "+a.number);
            this.instructions.add("ireturn");
        }
        else if(a.type instanceof CharType){
            this.instructions.add("iload "+a.number);
            this.instructions.add("ireturn");
        }
        else if(a.type instanceof FloatType){
            this.instructions.add("fload "+a.number);
            this.instructions.add("freturn");
        }
        else if(a.type instanceof StringType){
            this.instructions.add("aload "+a.number);
            this.instructions.add("areturn");
        }
        else if(a.type instanceof BooleanType){
            this.instructions.add("iload "+a.number);
            this.instructions.add("ireturn");
        }
        else if(a.type instanceof ArrayType){
            this.instructions.add("aload "+a.number);
            this.instructions.add("areturn");
        }
        else{
            return;
        }
    }
}