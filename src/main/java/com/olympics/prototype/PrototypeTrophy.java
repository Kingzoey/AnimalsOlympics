package com.olympics.prototype;

public class PrototypeTrophy {
    public static void main(String[] args) {
        Trophy obj1 = new Trophy("猫", "选手：在动物运动会中表现优秀，获得击剑项目金牌。", "动物运动委员会");
        obj1.display();
        try {
            Trophy obj2 = (Trophy) obj1.clone();
            obj2.setName("狗");
            obj2.display();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
