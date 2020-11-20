package com.olympics.InformationNotice;

public class runner extends athlete{

    public runner(animal Animal){
        super(Animal);
    }
    @Override
    public void competition() {
        System.out.println("我参加跑步");
        mAnimal.say();
    }

    @Override
    public void update(String message) {
        System.out.println(fanName + "知道了:" + message + "这条消息");
    }
}
