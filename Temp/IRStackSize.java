package Temp;

import java.util.ArrayList;
import java.util.List;
import Type.*;

public class IRStackSize extends IRInstruction
{    //List temps;
    public IRStackSize(int stack)
    {
        this.instructions = new ArrayList<String>();
        this.instructions.add(".limit stack 16");
    }
}