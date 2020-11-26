package com.olympics.nullobject;

public class InfoFactory {
    public Info getInfo(int ID) {
        Info info;
        switch (ID) {
            case 1:
                info = new ConcreteInfo(ID, "老虎", "乒乓球", "2020-10-10");
                break;
            case 2:
                info = new ConcreteInfo(ID, "狮子", "篮球", "2020-10-11");
                break;
            default:
                info = new NullInfo();//创建一个NullInfo对象
                break;
        }

        return info;
    }
}
