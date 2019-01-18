package Temp;

import java.util.ArrayList;
import java.util.List;
import Type.*;

public class IRBoilerPlate extends IRInstruction
{    //List temps;
    public IRBoilerPlate(String name)
    {
        this.instructions = new ArrayList<String>();
        //this.instructions.add("PROG "+name.substring(0, name.length() - 3));
        this.instructions.add(".method public static main([Ljava/lang/String;)V");
        this.instructions.add("    .limit locals 1");
        this.instructions.add("    .limit stack 4");
        this.instructions.add("    invokestatic "+name+"/__main()V");
        this.instructions.add("    return");
        this.instructions.add(".end method");

        this.instructions.add(".method public <init>()V");
        this.instructions.add("    aload_0");
        this.instructions.add("    invokenonvirtual java/lang/Object/<init>()V");
        this.instructions.add("    return");
        this.instructions.add(".end method");
    }
}