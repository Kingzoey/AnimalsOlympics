package com.olympics.Visitor;

/**
 * 访问者类
 */
public interface Visitor {

    void visit(Football football);

    void visit(Basketball basketball);

    void visit(Volleyball volleyball);
}
