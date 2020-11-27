package com.olympics.informationnotice;

public abstract class athlete {
    animal mAnimal; //动物属性，继承者可使用对应动物操作

    public athlete(animal Animal) {
        this.mAnimal = Animal;
    }

    public abstract void competition();    //比赛操作

    String fanName;

    void setName(String B) {
        this.fanName = B;
    }

    public abstract void update(String message);
//    {
//       // System.out.println(fanName + "知道了:" + message + "这条消息");
//    }


}
