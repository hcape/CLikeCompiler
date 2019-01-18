package Temp;

import java.util.ArrayList;
import java.util.List;
import Type.*;

public class IRProgramName extends IRInstruction
{    //List temps;
    public IRProgramName(String name)
    {
        this.instructions = new ArrayList<String>();
        //this.instructions.add("PROG "+name.substring(0, name.length() - 3));

        this.instructions.add(".source "+name+".ir");
        this.instructions.add(".class public "+ name);
       // this.instructions.add("    ... extends");
        this.instructions.add(".super java/lang/Object");
        

    }
}