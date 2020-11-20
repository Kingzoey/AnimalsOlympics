package com.olympics.Visitor;

public class BasketballPlayer implements Visitor {

    @Override
    public void visit(Football football) {
        System.out.println("Checking football...No");
    }

    @Override
    public void visit(Basketball basketball) {
        System.out.println("Checking basketball...Yes");
    }

    @Override
    public void visit(Volleyball volleyball) {
        System.out.println("Checking volleyball...No");
    }

}
