package com.olympics.nullobject;

public class ConcreteInfo implements Info {
    private int ID;
    private String name;
    private String game;
    private String time;

    // 构造函数
    public ConcreteInfo(int ID, String name, String game, String time) {
        this.ID = ID;
        this.name = name;
        this.game = game;
        this.time = time;
    }

    public void show() {
        System.out.println(ID + "**" + name + "**" + game + "**" + time);
    }

    public boolean isNull() {
        return false;
    }
}
