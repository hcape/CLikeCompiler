package Temp;

import java.util.ArrayList;
import java.util.List;


import Type.*;

public class IRBinaryOp extends IRInstruction
{
    //List temps;
    public IRBinaryOp(Temp dest, Temp a, Temp b, IRBinaryOpType t, LabelFactory lf)
    {
        //this.temps = new ArrayList<String>();
        this.instructions = new ArrayList<String>();
        //this.temps.add("TEMP "+dest.number +":"+ dest.GetType());
        //this.temps.add("TEMP "+a.number + ":"+ a.GetType());
        //this.temps.add("TEMP "+b.number + ":"+ b.GetType());

        String prefix;
        if(a.type instanceof IntegerType){
            prefix = "i";
        }
        else if(a.type instanceof CharType){
            prefix = "i";
        }
        else if(a.type instanceof FloatType){
            prefix = "f";
        }
        else if(a.type instanceof StringType){
            switch(t){
                case IRBinaryAdd:
                this.instructions.add("new java/lang/StringBuffer");
                this.instructions.add("dup");
                this.instructions.add("invokenonvirtual java/lang/StringBuffer/<init>()V");
                this.instructions.add("aload " + a.number);
                this.instructions.add("invokevirtual java/lang/StringBuffer/append(Ljava/lang/String;)Ljava/lang/StringBuffer;");
                this.instructions.add("aload " + b.number);
                this.instructions.add("invokevirtual java/lang/StringBuffer/append(Ljava/lang/String;)Ljava/lang/StringBuffer;");
                this.instructions.add("invokevirtual java/lang/StringBuffer/toString()Ljava/lang/String;");
                this.instructions.add("astore "+dest.number);
                break;
               
                case IRBinarySub:
                break;

                case IRBinaryMult:
                break;

                
                case IRBinaryLess:
                IRLabel L1 = lf.getLabel();
                IRLabel L2 = lf.getLabel();
                this.instructions.add("aload " + a.number);
                this.instructions.add("aload " + b.number);
                this.instructions.add("invokevirtual java/lang/String/compareTo(Ljava/lang/String;)I");
                this.instructions.add("iflt " + "L" + L1.number);
                this.instructions.add("ldc 0");
                this.instructions.add("goto L" + L2.number);
                this.instructions.add("L"+L1.number+":");
                this.instructions.add("ldc 1");
                this.instructions.add("L"+L2.number+":");
                this.instructions.add("istore " + dest.number);
                break;
    
                case IRBinaryEq:
                L1 = lf.getLabel();
                L2 = lf.getLabel();
                this.instructions.add("aload " + a.number);
                this.instructions.add("aload " + b.number);
                this.instructions.add("invokevirtual java/lang/String/compareTo(Ljava/lang/String;)I");
                this.instructions.add("ifeq " + "L" + L1.number);
                this.instructions.add("ldc 0");
                this.instructions.add("goto L" + L2.number);
                this.instructions.add("L"+L1.number+":");
                this.instructions.add("ldc 1");
                this.instructions.add("L"+L2.number+":");
                this.instructions.add("istore " + dest.number);
                break;
                
            }
            return;
        }

        else{
            prefix = "error";
        }

        this.instructions.add(prefix + "load " + a.number);
        this.instructions.add(prefix + "load " + b.number);


        String symbol = "error";
        switch(t){
            case IRBinaryAdd:
            symbol = "+";
            
            this.instructions.add(prefix + "add");
            this.instructions.add(prefix + "store " + dest.number);
            break;
           
            case IRBinarySub:
            symbol = "-";
            this.instructions.add(prefix + "sub");
            this.instructions.add(prefix + "store " + dest.number);
            break;

            case IRBinaryMult:
            symbol = "*";
            this.instructions.add(prefix + "mul");
            this.instructions.add(prefix + "store " + dest.number);
            break;

            
            case IRBinaryLess:
            symbol = "<";
            IRLabel L3 = lf.getLabel();
            IRLabel L4 = lf.getLabel();

            this.instructions.add("if_" + prefix + "cmplt " + "L"+L3.number); //need the number 1
            this.instructions.add("ldc 0");
            this.instructions.add("goto L" + L4.number); //number 2
            this.instructions.add("L"+L3.number+":");
            this.instructions.add("ldc 1"); //this is number 1 instr
            this.instructions.add("L"+L4.number+":");
            this.instructions.add("istore "+dest.number); //this is number 2
            break;

            case IRBinaryEq:
            symbol = "==";
            L3 = lf.getLabel();
            L4 = lf.getLabel();
            this.instructions.add("if_" + prefix + "cmpeq " + "L"+L3.number); //need the number 1
            this.instructions.add("ldc 0");
            this.instructions.add("goto L" + L4.number); //number 2
            this.instructions.add("L"+L3.number+":");
            this.instructions.add("ldc 1"); //this is number 1 instr
            this.instructions.add("L"+L4.number+":");
            this.instructions.add("istore "+dest.number); //this is number 2
            break;

        }

        //String i = "T" + dest.number + ":= T" + a.number + " " + prefix + symbol + " T" + b.number + ";";
    }
}