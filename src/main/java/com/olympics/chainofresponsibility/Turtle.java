package com.olympics.chainofresponsibility;

public class Turtle extends Athlete implements Handler {
    private final float crawlSpeed;

    public Turtle(String name, float crawlSpeed) {
        super(name);
        this.crawlSpeed = crawlSpeed;
    }

    @Override
    public float process(Segment segment) {
        return segment.getMeter() / getSpeed();
    }

    @Override
    public float getSpeed() {
        return crawlSpeed / 2;
    }
}
