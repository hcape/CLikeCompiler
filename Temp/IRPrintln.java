package Temp;

import java.util.ArrayList;
import java.util.List;

import Type.*;

public class IRPrintln extends IRInstruction
{
   
    public IRPrintln(Temp a)
    {
        this.instructions = new ArrayList<String>();
        
        String prefix;
        this.instructions.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
        if(a.type instanceof IntegerType){
            this.instructions.add("iload "+a.number);
            this.instructions.add("invokevirtual java/io/PrintStream/println(I)V");
            //prefix = "I";
        }
        else if(a.type instanceof CharType){
            this.instructions.add("iload "+a.number);
            this.instructions.add("i2c");
            this.instructions.add("invokevirtual java/io/PrintStream/println(C)V");
            //prefix = "C";
        }
        else if(a.type instanceof FloatType){
            this.instructions.add("fload "+a.number);
            this.instructions.add("invokevirtual java/io/PrintStream/println(F)V");
            //prefix = "F";
        }
        else if(a.type instanceof StringType){
            this.instructions.add("aload " + a.number); //string value
            this.instructions.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
         //   prefix = "S";
        }

        else{
            prefix = "error";
        }

        //String i = "PRINTLN" + prefix + " T" + a.number + ";";
    }
}