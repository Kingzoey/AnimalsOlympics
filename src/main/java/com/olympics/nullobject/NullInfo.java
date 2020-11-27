package com.olympics.nullobject;

public class NullInfo implements Info {
    public boolean isNull() {
        return true;
    }

    public void show() {
        System.out.println("Sorry，未找到符合您输入的ID的比赛人员信息，请确认您输入的不是非法值。");

    }
}
