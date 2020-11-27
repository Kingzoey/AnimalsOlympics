package com.olympics.proxy;

import com.olympics.staticfactory.BasketballPlayer;

/**
 * 替补球员，实现接口PositionProxy
 *
 * @author Zhenyu Dong
 * @version 1.0
 * @designPattern Proxy Pattern
 * @date 2020.11.16
 */

public class SubstitutePlayer implements PositionProxy {
    private final BasketballPlayer starterPlayer;
    private final BasketballPlayer subPlayer;

    public SubstitutePlayer(BasketballPlayer starterPlayer, BasketballPlayer subPlayer) {
        this.starterPlayer = starterPlayer;
        this.subPlayer = subPlayer;
    }

    @Override
    public void play() {
        StarterPlayer player = new StarterPlayer(subPlayer);
        player.play();
        starterPlayer.isOnCourt = false;
        subPlayer.isOnCourt = true;
        System.out.println("替补球员" + subPlayer.name + subPlayer.number + "替换 " + starterPlayer.name + starterPlayer.number);
    }
}
