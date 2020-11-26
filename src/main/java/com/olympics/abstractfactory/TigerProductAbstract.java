package com.olympics.abstractfactory;

public class TigerProductAbstract implements MemberProductAbstract {
    @Override
    public void product() {
        System.out.println("A tiger member is produced!");
    }
}
