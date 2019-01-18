package Temp;

import java.util.ArrayList;
import java.util.List;

import Temp.IRInstruction;
import Type.*;

public class IRUnaryOp extends IRInstruction
{
    //List temps;
 
    public IRUnaryOp(Temp dest, Temp a, IRUnaryOpType t)
    {
        //this.temps = new ArrayList<String>();
        this.instructions = new ArrayList<String>();
        //this.temps.add("TEMP "+dest.number +":"+ dest.GetType());
        
        String symbol;
        switch(t){
            case IRUnaryInvert:
            symbol = "Z!";
            break;

            default:
            symbol = "error";
            break;

        }
        //String i = "T" + dest.number +  ":= " + symbol + "T" + a.number + ";";
        this.instructions.add("iload " + a.number);
        this.instructions.add("ldc 1");
        this.instructions.add("ixor");
        this.instructions.add("istore "+dest.number);
        
    }
}