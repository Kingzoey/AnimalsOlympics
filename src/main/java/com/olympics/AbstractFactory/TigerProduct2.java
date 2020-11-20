package com.olympics.AbstractFactory;

public class TigerProduct2 implements MemberProduct2 {
    @Override
    public void product() {
        System.out.println("A tiger member is produced!");
    }
}
