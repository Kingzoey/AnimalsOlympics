package com.olympics.nullobject;

public class NullObjectTest {
    public static void main(String[] args) {
        InfoFactory infoFactory = new InfoFactory();
        Info info = infoFactory.getInfo(-1);
        System.out.println("比赛开始前老虎输入自己id查询自己的比赛信息");
        info.show();
        System.out.println("老虎输入错误，系统提示重新输入");
        Info info2 = infoFactory.getInfo(1);
        info2.show();
        System.out.println("查询成功！");
    }
}
