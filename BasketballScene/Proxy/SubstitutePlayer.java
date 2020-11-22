package com.basketballScene;

/**
 * @className: SubstitutePlayer
 * @author: Zhenyu Dong
 * @description: 替补球员，实现接口PositionProxy
 * @designPattern: Proxy Pattern
 * @date: 2020.11.16
 * @version: 1.0
 */

public class SubstitutePlayer implements PositionProxy {
    private BasketballPlayer starterPlayer;
    private BasketballPlayer subPlayer;

    public SubstitutePlayer(BasketballPlayer starterPlayer,BasketballPlayer subPlayer) {
        this.starterPlayer = starterPlayer;
        this.subPlayer = subPlayer;
    }
    @Override
    public void play() {
        StarterPlayer player = new StarterPlayer(subPlayer);
        player.play();
        starterPlayer.isOnCourt = false;
        subPlayer.isOnCourt = true;
        System.out.println("替补球员"+subPlayer.name + subPlayer.number +"替换 " +starterPlayer.name + starterPlayer.number);
    }
}
