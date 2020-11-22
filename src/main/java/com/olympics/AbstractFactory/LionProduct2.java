package com.olympics.AbstractFactory;

public class LionProduct2 implements MemberProduct2 {
    @Override
    public void product() {
        System.out.println("A lion member is produced!");
    }
}
