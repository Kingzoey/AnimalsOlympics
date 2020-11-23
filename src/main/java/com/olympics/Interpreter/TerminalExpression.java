package com.olympics.Interpreter;
import java.util.*;

public class TerminalExpression implements Expression {
    private Set<String> set= new HashSet<String>();
    public TerminalExpression(String[] data)
    {
        for(int i=0;i<data.length;i++)
            set.add(data[i]);
    }
    @Override
    public boolean interpret(String context) {
        if(set.contains(context))
        {
            return true;
        }
        return false;
    }
}
