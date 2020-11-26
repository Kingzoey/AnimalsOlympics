package com.olympics.visitor;


/**
 * Interface for the nodes in hierarchy.
 */
public interface Element {
    public void accept(Visitor visitor);
}
