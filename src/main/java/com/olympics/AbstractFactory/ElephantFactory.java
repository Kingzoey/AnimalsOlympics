package com.olympics.AbstractFactory;

public class ElephantFactory implements Provider {
    @Override
    public MemberProductAbstract produce() {
        return new ElepantProductAbstract();
    }
}
