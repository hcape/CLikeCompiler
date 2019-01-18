package Temp;

import java.util.ArrayList;
import java.util.List;
import Type.*;

public class IRFunction extends IRInstruction
{
    //ist temps;
   
    public IRFunction(Type type, String name, List<Temp> params)
    {
        this.instructions = new ArrayList<String>();
        //String i = "FUNC " + name + " (";
        String prefix = "";
        String ty = this.getTypeName(type);

        if(name.equals("main")){
            name="__main";
        }
        String i = ".method public static " + name + "(";

        for(int a = 0; a < params.size(); a++){
            Temp t = params.get(a);
            if(t.type instanceof IntegerType){
                prefix = "I";
            }
            else if(t.type instanceof CharType){
                prefix = "C";
            }
            else if(t.type instanceof FloatType){
                prefix = "F";
            }
            else if(t.type instanceof StringType){
                prefix = "Ljava/lang/String;";
            }
            else if(t.type instanceof BooleanType){
                prefix = "B";
            }
            else if(t.type instanceof ArrayType){
                if(t.arrayType instanceof IntegerType){
                    prefix = "[I";
                }
                else if(t.arrayType instanceof CharType){
                    prefix = "[C";
                }
                else if(t.arrayType instanceof FloatType){
                    prefix = "[F";
                }
                else if(t.arrayType instanceof StringType){
                    prefix = "[Ljava/lang/String;";
                }
                else if(t.arrayType instanceof BooleanType){
                    prefix = "[Z";
                }
            }
            else{
                prefix = "V";
            }
        i = i + prefix;
        }


        //i = i.substring(0, i.length() - 2); //remove last , 
        i = i + ")"+ty;
        this.instructions.add(i);
    }

    public String getTypeName(Type a)
    {
        if(a instanceof IntegerType){
            return "I";
       }
       else if(a instanceof CharType){
           return "C";
       }
       else if(a instanceof FloatType){
           return "F";
       }
       else if(a instanceof StringType){
           return "Ljava/lang/String;";
       }
       else if(a instanceof BooleanType){
           return "Z";
       }
       else if(a instanceof ArrayType){
           ArrayType b = (ArrayType) a;
           if(b.t instanceof IntegerType){
               return "[I";
           }
           else if(b.t instanceof CharType){
               return "[C";
           }
           else if(b.t instanceof FloatType){
               return "[F";
           }
           else if(b.t instanceof StringType){
               return "[Ljava/lang/String;";
           }
           else if(b.t instanceof BooleanType){
               return "[Z";
           }
       }
       else{
           return "V";
       }

    return "V";
    }
}