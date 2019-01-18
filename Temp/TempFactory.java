package Temp;
import java.util.List;
import java.util.ArrayList;
import Type.*;
import Environment.*;

public class TempFactory
{
    int count;
    List<Integer> openTemps; 
    List<String> tempIR; 
    List<String> tempIRDef;

    Environment<String, Temp> vEnv; 
    public TempFactory()
    {
        this.count = -1;
        this.openTemps = new ArrayList<Integer>();
        this.tempIR = new ArrayList<String>();
        this.tempIRDef = new ArrayList<String>();
        this.vEnv = new ListEnvironment<String,Temp>();
    }

    public Temp getTemp(Type t, boolean isParam)
    {
        if(this.openTemps.isEmpty())
        {
            this.count++;
            
            if(this.count > 65536){
                //thats bad
            }
            Temp ta = new Temp(this.count, t);
            this.AddTemp(ta, isParam);
            return ta;
        }
        else
        {
            int i = this.openTemps.remove(0);
            Temp tb = new Temp(i, t);
            return tb;
        }
    }

    public Temp getTemp(Type t, Type t2, boolean isParam)
    {
        if(this.openTemps.isEmpty())
        {
            this.count++;
            if(this.count > 65536){
                //thats bad
            }
            Temp ta =  new Temp(this.count, t, t2);
            this.AddTemp(ta, isParam);
            return ta;
        }
        else
        {
            int i = this.openTemps.remove(0);
            return new Temp(i, t, t2);
        }
    }


    public Temp getTemp(Type t, String t2, boolean isParam)
    {
        if(this.openTemps.isEmpty())
        {
            this.count++;
            if(this.count > 65536){
                //thats bad
            }
            Temp ta =  new Temp(this.count, t, t2);
            this.AddTemp(ta, isParam);
            return ta;
        }
        else
        {
            int i = this.openTemps.remove(0);
            return new Temp(i, t, t2);
        }
    }


    public void returnTemp(Temp t)
    {
        
        this.openTemps.add(t.number);
    }

    public void AddTemp(Temp a, boolean isParam)
    {
        this.tempIR.add(".var " + a.number + " is T" + a.number +" " + a.GetJTypeUpper());
        //this.tempIR.add("TEMP "+a.number +":"+ a.GetType()+";");
        if(!isParam)
        {

            Temp t = a;
            if(t.type instanceof IntegerType){
                this.tempIRDef.add("ldc 0");
                this.tempIRDef.add("istore " + t.number);
                //prefix = "I";
            }
            else if(t.type instanceof CharType){
                this.tempIRDef.add("ldc 0");
                this.tempIRDef.add("istore " + t.number);
            }
            else if(t.type instanceof FloatType){
                this.tempIRDef.add("ldc 0.0");
                this.tempIRDef.add("fstore " + t.number);
            }
            else if(t.type instanceof StringType){
                this.tempIRDef.add("aconst_null");
                this.tempIRDef.add("astore " + t.number);
            }
            else if(t.type instanceof BooleanType){
                this.tempIRDef.add("ldc 0");
                this.tempIRDef.add("istore " + t.number);
            }
            else if(t.type instanceof ArrayType){
                this.tempIRDef.add("aconst_null");
                this.tempIRDef.add("astore " + t.number);
            }
        }
    }

    public void Print(IRLabel l, IRLabel r)
    {
        for(int j = 0; j < this.tempIR.size(); j++){
            System.out.println(this.tempIR.get(j)+" from L"+l.number+" to L"+r.number);
        }
    }

    public void PrintAutos()
    {
        for(int j = 0; j < this.tempIRDef.size(); j++){
            System.out.println(this.tempIRDef.get(j));
        }
    }
}
