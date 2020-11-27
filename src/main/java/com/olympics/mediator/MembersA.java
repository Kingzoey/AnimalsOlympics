package com.olympics.mediator;

public class MembersA extends Members {

    // 具体成员类继承自Members,此刻就可以与中介者mediator进行通信了
    public MembersA(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void getMessage(String message) {
        System.out.println("裁判A" + "-" + name + "-" + "获得信息：" + message);
    }

    //成员A与中介者通信
    public void contact(String message) {
        mediator.contact(message, this);
    }
}
