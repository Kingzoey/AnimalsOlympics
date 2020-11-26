package com.olympics.abstractfactory;

public class TigerFactory implements Provider {
    @Override
    public MemberProductAbstract produce() {
        return new TigerProductAbstract();
    }
}
