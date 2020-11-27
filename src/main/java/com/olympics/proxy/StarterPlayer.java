package com.olympics.proxy;

import com.olympics.staticfactory.BasketballPlayer;

/**
 * 首发球员，实现接口PositionProxy
 *
 * @author Zhenyu Dong
 * @version 1.0
 * @designPattern Proxy Pattern
 * @date 2020.11.16
 */

public class StarterPlayer implements PositionProxy {
    private final BasketballPlayer player;

    public StarterPlayer(BasketballPlayer player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("球员登场！" + player.name + player.number);
    }
}
