package com.olympics.Visitor;

public class FootballPlayer implements Visitor {

    @Override
    public void visit(Football football) {
        System.out.println("Checking football...Yes");
    }

    @Override
    public void visit(Basketball basketball) {
        System.out.println("Checking basketball...No");
    }

    @Override
    public void visit(Volleyball volleyball) {
        System.out.println("Checking volleyball...No");
    }

}
