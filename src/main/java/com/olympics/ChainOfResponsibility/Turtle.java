package com.olympics.ChainOfResponsibility;

public class Turtle implements Handler {
    private final int speed;

    public Turtle(int speed) {
        this.speed = speed;
    }

    @Override
    public Double process(Segment segment) {
        return segment.getMeter() / (double)speed;
    }
}
