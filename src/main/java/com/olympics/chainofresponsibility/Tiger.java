package com.olympics.chainofresponsibility;

public class Tiger extends Athlete implements Handler {
    private final int runSpeed;

    public Tiger(String name, int runSpeed) {
        super(name);
        this.runSpeed = runSpeed;
    }

    @Override
    public float process(Segment segment) {
        return segment.getMeter() / getSpeed();
    }

    @Override
    public float getSpeed() {
        return runSpeed;
    }
}
