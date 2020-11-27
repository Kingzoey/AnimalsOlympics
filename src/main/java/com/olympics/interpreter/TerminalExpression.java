package com.olympics.interpreter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TerminalExpression implements Expression {
    private final Set<String> set = new HashSet<>();

    public TerminalExpression(String[] data) {
        Collections.addAll(set, data);
    }

    @Override
    public boolean interpret(String context) {
        return set.contains(context);
    }
}
