package com.olympics.informationnotice;

public class runner extends athlete {

    public runner(animal Animal) {
        super(Animal);
    }

    @Override
    public void competition() {
        mAnimal.sayAnimal();
        System.out.println("我参加跑步比赛");
    }

    @Override
    public void update(String message) {
        System.out.println("观察者模式: " + fanName + "知道了通知中心发布的消息：" + message);
    }
}
