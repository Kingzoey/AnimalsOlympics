package com.olympics.InformationNotice;

public abstract class athlete {
    animal mAnimal; //动物属性，继承者可使用对应动物操作

    public athlete(animal Animal){
        this.mAnimal= Animal;
    }
    public abstract void competition();    //比赛操作

}
