package com.olympics.mediator;


public class MembersB extends Members {

    public MembersB(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void getMessage(String message) {
        System.out.println("成员B" + "-" + name + "-" + "获得信息：" + message);
    }

    //成员B与中介者通信
    public void contact(String message) {
        mediator.contact(message, this);
    }
}