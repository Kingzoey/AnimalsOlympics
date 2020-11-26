package com.olympics.basketballscene;

/**
 * @className: BasketballSceneDemo
 * @author: Zhenyu Dong
 * @description: 篮球场景的Demo，测试我的四个设计模式（静态工厂、状态模式、策略模式和代理模式）
 * @date: 2020.11.10
 * @version: 1.0
 */

public class BasketballSceneDemo {
    public static void main(String[] args) {
        BasketballGame game = new BasketballGame();
        game.gameStart();
    }
}
