package Temp;

import java.util.ArrayList;
import java.util.List;
import Type.*;

public class IRAssign extends IRInstruction
{
    //List temps;
    public IRAssign(Temp dest, Temp a)
    {
        this.instructions = new ArrayList<String>();
        
        //String i = "T"+ dest.number +  " := T" + a.number + ";"  ;
        //this.instructions.add(i);
        String ty = a.GetJType();
        this.instructions.add(ty + "load " + a.number);
        this.instructions.add(ty + "store " + dest.number);

        
    }

    public IRAssign(Temp dest, Temp a, Temp b)
    {
        this.instructions = new ArrayList<String>();
        
        //String i = "T"+ dest.number +  " := T" + a.number + "[T" + b.number +  "];"  ;
        this.instructions.add("aload "+a.number);
        this.instructions.add("iload "+b.number);
        this.instructions.add(dest.GetJType() + "aload");
        this.instructions.add(dest.GetJType() + "store "+dest.number);
    }

    public IRAssign(Temp array, Temp index, Temp assign, boolean dummy)
    {
        this.instructions = new ArrayList<String>();
        
        //String i = "T"+ array.number + "[T" + index.number + "] := T" + assign.number + ";";

        this.instructions.add("aload "+array.number);
        this.instructions.add("iload "+index.number);
        this.instructions.add("iload "+assign.number);
        this.instructions.add(assign.GetJType() + "astore");
        
    }

    public IRAssign(Temp dest, int n)
    {
        this.instructions = new ArrayList<String>();
        
        //String i = "T"+ dest.number + ":= "+ n + ";";
        //this.instructions.add(i);
        this.instructions.add("ldc " + n);
        this.instructions.add("istore " + dest.number);
    }

    public IRAssign(Temp dest, float f)
    {
        this.instructions = new ArrayList<String>();
        
        //String i = "T"+ dest.number + ":= "+ f + ";";
        //this.instructions.add(i);
        this.instructions.add("ldc " + f);
        this.instructions.add("fstore " + dest.number);
    }

    public IRAssign(Temp dest, String s)
    {
        this.instructions = new ArrayList<String>();
        
        dest.stringVal = s;
        this.instructions.add("ldc  "+ s);
        this.instructions.add("astore " + dest.number);
        //String i = "T"+ dest.number + ":= "+ s + ";";
        //this.instructions.add(i);
    }

    public IRAssign(Temp dest, char c)
    {
        this.instructions = new ArrayList<String>();
        
        //String i = "T"+ dest.number + ":= \'"+ c + "\';";
        //this.instructions.add(i);

        this.instructions.add("ldc " + (int)c);
        this.instructions.add("istore " + dest.number);
    }

    public IRAssign(Temp dest, boolean b)
    {
        this.instructions = new ArrayList<String>();
        if(b)
        {
            this.instructions.add("ldc 1");
            this.instructions.add( "istore " + dest.number);
            //i = "T"+ dest.number + ":= TRUE;";

        }
        else{
            this.instructions.add("ldc 0");
            this.instructions.add("istore " + dest.number);
            //i = "T"+ dest.number + ":= FALSE;";
        }
        //this.instructions.add(i);
    }
}