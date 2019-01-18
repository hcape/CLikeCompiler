package Temp;

import Type.*;

public class LabelFactory
{
    int count;

    public LabelFactory()
    {
        this.count = -1;
    }

    public IRLabel getLabel()
    {
            this.count++;
            if(this.count > 65536){
                //thats bad
            }
            return new IRLabel(this.count);
    }

    public void Reset()
    {
        this.count = -1;
    }
}
