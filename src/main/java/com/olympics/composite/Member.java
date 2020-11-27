package com.olympics.composite;

public class Member extends Node {
    public Member(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("Member name:" + name + "  ");
    }
}
