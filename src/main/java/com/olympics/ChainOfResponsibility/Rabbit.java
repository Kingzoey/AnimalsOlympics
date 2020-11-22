package com.olympics.ChainOfResponsibility;

public class Rabbit implements Handler {
    private final int speed;

    public Rabbit(int speed) {
        this.speed = speed;
    }

    @Override
    public Double process(Segment segment) {
        return segment.getMeter() / (double)speed;
    }
}
