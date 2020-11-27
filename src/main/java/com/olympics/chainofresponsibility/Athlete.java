package com.olympics.chainofresponsibility;

public abstract class Athlete {
    protected String name;

    public Athlete(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract float getSpeed();
}
