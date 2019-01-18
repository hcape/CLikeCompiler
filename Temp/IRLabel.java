package Temp;

import java.util.ArrayList;
import Type.*;

public class IRLabel extends IRInstruction
{
    int number;
    public IRLabel(int i)
    {
        this.instructions = new ArrayList<String>();
        this.number = i;
        this.instructions.add("L"+this.number + ":");
    }
}