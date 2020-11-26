package com.olympics.visitor;

public class Manager implements Visitor {

    @Override
    public void visit(Consumable consumable) {
        System.out.println("Manager is checking consumable...");
    }

    @Override
    public void visit(Equipment equipment) {
        System.out.println("Manager is checking equipment...");
    }

}
