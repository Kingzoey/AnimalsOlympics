package com.olympics.compositeentity;

public class CompositeEntity {
    public static void main(String[] args) {
        System.out.println("创建一个射击运动员");
        ShootPlayer shootPlayer = new ShootPlayer();
        System.out.println("设置比赛用枪尺寸和子弹数量");
        shootPlayer.setData((float) 10.5, 5);
        shootPlayer.printData();
    }
}
