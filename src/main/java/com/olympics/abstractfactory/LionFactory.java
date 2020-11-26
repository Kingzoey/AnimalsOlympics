package com.olympics.abstractfactory;

public class LionFactory implements Provider {
    @Override
    public MemberProductAbstract produce() {
        return new LionProductAbstract();
    }
}
