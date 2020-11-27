package com.olympics.chainofresponsibility;

public class Rabbit extends Athlete implements Handler {
    private final float jumpSpeed;

    public Rabbit(String name, float jumpSpeed) {
        super(name);
        this.jumpSpeed = jumpSpeed;
    }

    /**
     * 兔子通过跳跃完成比赛
     *
     * @param segment some argument
     * @return some object
     */
    @Override
    public float process(Segment segment) {
        return segment.getMeter() / getSpeed();
    }

    @Override
    public float getSpeed() {
        return 3 * jumpSpeed;
    }
}
