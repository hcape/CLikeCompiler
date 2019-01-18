package Temp;

import java.util.ArrayList;
import java.util.List;
import Type.*;

public class IRFunctionCall extends IRInstruction
{
   
    public IRFunctionCall(String name, String prog, List<Temp> params)
    {
        this.instructions = new ArrayList<String>();
        //String i = "CALL " + name + "(";
        String i = "invokestatic " + prog + "/" + name + "("; //need that number thing and the params 
        for(int a = 0; a < params.size(); a++){
            Temp b = params.get(a);
            i = i + b.GetJTypeUpper();
            this.instructions.add(b.GetJType() + "load "+b.number);
            //i = i + "T" + b.number; 
            //if(a+1!=params.size()){
             //   i = i + " ";
            //}
        }

        i = i + ")V";
        this.instructions.add(i);
    }

    public IRFunctionCall(String name, String prog, List<Temp> params, Temp dest)
    {
        this.instructions = new ArrayList<String>();
        //String i = "T" + dest.number + ":= CALL " + name + "(";
        String i = "invokestatic " + prog + "/" + name + "("; //need that number thing and the params 

        for(int a = 0; a < params.size(); a++){
            Temp b = params.get(a);
            i = i + b.GetJTypeUpper();
            this.instructions.add(b.GetJType() + "load "+b.number);
            // i = i + "T" + b.number; -
            // if(a+1!=params.size()){
            //     i = i + " ";
            // }
            
        }
        i = i + ")" + dest.GetJTypeUpper();
        this.instructions.add(i);
        this.instructions.add(dest.GetJType()+"store "+dest.number);
    }
}