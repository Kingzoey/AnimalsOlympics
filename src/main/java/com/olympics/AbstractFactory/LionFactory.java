package com.olympics.AbstractFactory;

public class LionFactory implements Provider {
    @Override
    public MemberProduct2 produce() {
        return new LionProduct2();
    }
}
