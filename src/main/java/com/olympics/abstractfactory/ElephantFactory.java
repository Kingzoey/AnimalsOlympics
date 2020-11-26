package com.olympics.abstractfactory;

public class ElephantFactory implements Provider {
    @Override
    public MemberProductAbstract produce() {
        return new ElepantProductAbstract();
    }
}
