package com.olympics.visitor;

public class Athlete implements Visitor {

    @Override
    public void visit(Consumable consumable) {
        System.out.println("Athlete is checking consumable...");
    }

    @Override
    public void visit(Equipment equipment) {
        System.out.println("Athlete is checking equipment...");
    }

}
