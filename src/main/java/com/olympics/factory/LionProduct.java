package com.olympics.factory;

public class LionProduct implements MemberProduct {
    @Override
    public void product() {
        System.out.println("A lion member is produced!");
    }
}
