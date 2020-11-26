package com.olympics.abstractfactory;

public class ElepantProductAbstract implements MemberProductAbstract {
    @Override
    public void product() {
        System.out.println("An elephant member is produced!");
    }
}
