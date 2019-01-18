package Temp;

import java.util.ArrayList;
import java.util.List;
import Temp.IRLabel;
import Type.*;

public class IRGoto extends IRInstruction
{
   
    public IRGoto(IRLabel a)
    {
        this.instructions = new ArrayList<String>();
        //String i = "GOTO L" + l.number + ";";
        String i = "goto L" + a.number;
        this.instructions.add(i);
    }

    public IRGoto(Temp a, IRLabel b)
    {
        this.instructions = new ArrayList<String>();
        this.instructions.add("iload " + a.number);
        String i = "ifne L" + b.number;;
        this.instructions.add(i);
    }
}