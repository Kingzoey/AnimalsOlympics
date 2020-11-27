package com.olympics.staticfactory;

/**
 * 根据用户输入培养球员（工厂类）
 *
 * @author Zhenyu Dong
 * @version 1.0
 * @designPattern Static Factory
 * @date 2020.11.11
 */

public class PlayerTraining {
    public static BasketballPlayer trainPlayer(String name, int age, int number, String playerType) {
        BasketballPlayer player = null;
        switch (playerType) {
            case "Guard":
                player = new PlayerGuard(name, age, number, playerType);
                break;
            case "Forward":
                player = new PlayerForward(name, age, number, playerType);
                break;
            case "Center":
                player = new PlayerCenter(name, age, number, playerType);
                break;
            default:
                System.out.println("没有类型为 " + playerType + " 的球员！请重新输入！");
                break;
        }
        return player;
    }
}
