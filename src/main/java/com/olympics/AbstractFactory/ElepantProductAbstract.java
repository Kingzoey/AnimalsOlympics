package com.olympics.AbstractFactory;

public class ElepantProductAbstract implements MemberProductAbstract {
    @Override
    public void product() {
        System.out.println("An elephant member is produced!");
    }
}
