package com.olympics.informationnotice;

public abstract class InformNotesTemplate {
    void initInform() {
        System.out.println("模板模式开始");
    }

    abstract void startInform();

    void endInform() {
        System.out.println("比赛信息发布结束，模板模式结束");

    }

    //模板
    public final void play() {
        initInform();

        startInform();

        endInform();
    }

}
