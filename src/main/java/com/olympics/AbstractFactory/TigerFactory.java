package com.olympics.AbstractFactory;

public class TigerFactory implements Provider {
    @Override
    public MemberProductAbstract produce() {
        return new TigerProductAbstract();
    }
}
