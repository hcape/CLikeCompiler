package Temp;

import java.util.ArrayList;
import java.util.List;
import Type.*;

public class IREndBracket extends IRInstruction
{    //List temps;
    public IREndBracket()
    {
        this.instructions = new ArrayList<String>();
        this.instructions.add(".end method");
    }
}