package com.olympics.AbstractFactory;

public class TigerProductAbstract implements MemberProductAbstract {
    @Override
    public void product() {
        System.out.println("A tiger member is produced!");
    }
}
