package Temp;

import java.util.ArrayList;
import java.util.List;
import Temp.IRInstruction;
import Type.*;

public class IRInstructionList
{

    List<IRInstruction> list;
	public IRInstructionList()
	{
        this.list = new ArrayList<IRInstruction>();
    }

    public void Add(IRInstruction ir)
    {
        this.list.add(ir);
    }
    public void Print(){
        for(int j = 0; j < this.list.size(); j++){
            IRInstruction i = this.list.get(j);
            if(i.temps != null)
            {
                for(int a = 0; a < i.temps.size(); a++){
                    String in = i.temps.get(a);
                    System.out.println(in);
                }
            }
        }
        for(int j = 0; j < this.list.size(); j++){
            IRInstruction i = this.list.get(j);
            if(i.instructions != null)
            {
                for(int a = 0; a < i.instructions.size(); a++){
                    String in = i.instructions.get(a);
                    System.out.println(in);
                }
            }
        }
        this.list.clear();
    }

}