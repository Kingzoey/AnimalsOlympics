package com.olympics.Factory;

public class LionProduct implements MemberProduct {
    @Override
    public void product() {
        System.out.println("A lion member is produced!");
    }
}
