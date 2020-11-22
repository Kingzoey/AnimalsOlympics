package com.olympics.Composite;

public abstract class Node {
    protected String name;
    public Node(String name)
    {
        this.name=name;
    }
    abstract void show();
}
