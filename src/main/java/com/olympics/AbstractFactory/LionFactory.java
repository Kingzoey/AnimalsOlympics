package com.olympics.AbstractFactory;

public class LionFactory implements Provider {
    @Override
    public MemberProductAbstract produce() {
        return new LionProductAbstract();
    }
}
