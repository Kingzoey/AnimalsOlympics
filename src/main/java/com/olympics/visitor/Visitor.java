package com.olympics.visitor;

/**
 * 访问者类
 */
public interface Visitor {

    void visit(Consumable consumable);

    void visit(Equipment equipment);
}
