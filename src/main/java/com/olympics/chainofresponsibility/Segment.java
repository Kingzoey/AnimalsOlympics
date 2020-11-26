package com.olympics.chainofresponsibility;

/**
 * 接力比赛的赛程
 */
public class Segment {
    private final int meter;

    public Segment(int meter) {
        this.meter = meter;
    }

    public int getMeter() {
        return meter;
    }
}
