package com.olympics.visitor;


/**
 * Interface for the nodes in hierarchy.
 */
public interface Element {
    void accept(Visitor visitor);
}
