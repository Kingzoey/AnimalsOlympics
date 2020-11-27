package com.olympics.factory;

public class ProductFactory {
    public MemberProduct produce(String type) {
        if ("lion".equals(type)) {
            return new LionProduct();
        } else if ("tiger".equals(type)) {
            return new TigerProduct();
        } else {
            System.out.println("Please input the right type!");
            return null;
        }
    }
}
