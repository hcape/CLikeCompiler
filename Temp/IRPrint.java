package Temp;

import java.util.ArrayList;
import java.util.List;

import Type.*;

public class IRPrint extends IRInstruction
{
    List temps;
   
    public IRPrint(Temp a)
    {
        this.instructions = new ArrayList<String>();
        
        String prefix;
        this.instructions.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
        if(a.type instanceof IntegerType){
            this.instructions.add("iload "+a.number);
            this.instructions.add("invokevirtual java/io/PrintStream/print(I)V");
            //prefix = "I";
        }
        else if(a.type instanceof CharType){
            this.instructions.add("iload "+a.number);
            this.instructions.add("invokevirtual java/io/PrintStream/print(C)V");
            //prefix = "C";
        }
        else if(a.type instanceof FloatType){
            this.instructions.add("fload "+a.number);
            this.instructions.add("invokevirtual java/io/PrintStream/print(F)V");
            //prefix = "F";
        }
        else if(a.type instanceof StringType){
            //ldc ">>> " //string value
            this.instructions.add("ldc " + a.stringVal); //string value
            this.instructions.add("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
         //   prefix = "S";
        }

        else{
            prefix = "error";
        }
    }
}