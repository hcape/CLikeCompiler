package Temp;

import java.util.ArrayList;
import java.util.List;
import Type.*;

public class IRTempDeclaration extends IRInstruction
{
   
    public IRTempDeclaration(Temp a)
    {
        this.temps = new ArrayList<String>();
       // this.instructions = new ArrayList<String>();
        
        String prefix = "";
        Temp t = a;
        if(t.type instanceof IntegerType){
            this.temps.add("ldc 0");
            this.temps.add("istore " + t.number);
            //prefix = "I";
        }
        else if(t.type instanceof CharType){
            this.temps.add("ldc 0");
            this.temps.add("istore " + t.number);
        }
        else if(t.type instanceof FloatType){
            this.temps.add("ldc 0.0");
            this.temps.add("fstore " + t.number);
        }
        else if(t.type instanceof StringType){
            this.temps.add("aconst_null");
            this.temps.add("astore " + t.number);
        }
        else if(t.type instanceof BooleanType){
            this.temps.add("ldc 0");
            this.temps.add("istore " + t.number);
        }
        else if(t.type instanceof ArrayType){
            this.temps.add("aconst_null");
            this.temps.add("astore " + t.number);
        }

        //String i = "TEMP " + a.number + ":" + prefix + ";";
        //String i =
        //this.temps.add(i);
    }
}