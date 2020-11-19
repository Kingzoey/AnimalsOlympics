package com.basketballScene;

/**
 * @className: StartPlayer
 * @author: Zhenyu Dong
 * @description: 首发球员，实现接口PositionProxy
 * @designPattern: Proxy Pattern
 * @date: 2020.11.16
 * @version: 1.0
 */

public class StarterPlayer implements PositionProxy {
    BasketballPlayer player;

    StarterPlayer(BasketballPlayer player) {
        this.player = player;
    }
    @Override
    public void play() {
        System.out.println("球员登场！" + player.name + player.number);
    }
}
