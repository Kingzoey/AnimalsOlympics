package com.olympics.state;

import com.olympics.staticfactory.BasketballPlayer;

/**
 * 比赛中，球员状态会改变，抽象类
 *
 * @author Zhenyu Dong
 * @version 1.0
 * @designPattern State Pattern
 * @date 2020.11.12
 */

public abstract class PlayerState {
    protected PlayerStateChange playerStateChange;

    public void setPlayerState(PlayerStateChange playerStateChange) {
        this.playerStateChange = playerStateChange;
    }

    public abstract void normal(BasketballPlayer player);

    public abstract void abnormal(BasketballPlayer player);

    public abstract void superNormal(BasketballPlayer player);
}
