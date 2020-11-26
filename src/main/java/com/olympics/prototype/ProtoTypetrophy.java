package com.olympics.prototype;

public class ProtoTypetrophy {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        trophy obj1=new trophy("猫","选手：在动物运动会中表现优秀，获得击剑项目金牌。","动物运动委员会");
        obj1.display();
        trophy obj2=(trophy) obj1.clone();
        obj2.setName("狗"); 
        obj2.display();
    }
}
