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

}
