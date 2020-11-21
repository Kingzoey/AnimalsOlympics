package com.olympics.ChainOfResponsibility;

public class Dog implements Handler {
    private final int speed;

    public Dog(int speed) {
        this.speed = speed;
    }

    @Override
    public Double process(Segment segment) {
        return segment.getMeter() / (double)speed;
    }
}
