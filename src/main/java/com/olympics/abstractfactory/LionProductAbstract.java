package com.olympics.abstractfactory;

public class LionProductAbstract implements MemberProductAbstract {
    @Override
    public void product() {
        System.out.println("A lion member is produced!");
    }
}
