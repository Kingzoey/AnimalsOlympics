package com.olympics.composite;

public abstract class Node {
    protected String name;

    public Node(String name) {
        this.name = name;
    }

    public abstract void show();
}
