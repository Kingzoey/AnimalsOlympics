package com.olympics.Visitor;


/**
 * Interface for the nodes in hierarchy.
 */
public interface Element {
    public void accept(Visitor visitor);
}
