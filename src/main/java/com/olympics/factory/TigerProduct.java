package com.olympics.factory;

public class TigerProduct implements MemberProduct {
    @Override
    public void product() {
        System.out.println("A tiger member is produced!");
    }
}
