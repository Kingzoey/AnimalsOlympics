package com.olympics.Visitor;

public class VolleyballPlayer implements Visitor {

    @Override
    public void visit(Football football) {
        System.out.println("Checking football...No");
    }

    @Override
    public void visit(Basketball basketball) {
        System.out.println("Checking basketball...No");
    }

    @Override
    public void visit(Volleyball volleyball) {
        System.out.println("Checking volleyball...Yes");
    }

}
