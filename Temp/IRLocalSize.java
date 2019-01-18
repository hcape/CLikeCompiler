package Temp;

import java.util.ArrayList;
import java.util.List;
import Type.*;

public class IRLocalSize extends IRInstruction
{    //List temps;
    public IRLocalSize(int locals)
    {
        this.instructions = new ArrayList<String>();
        this.instructions.add(".limit locals " + locals);
    }
}