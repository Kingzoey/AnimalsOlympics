package com.olympics.state;

import com.olympics.staticfactory.BasketballPlayer;

/**
 * 实现球员状态变化的控制
 *
 * @author Zhenyu Dong
 * @version 1.0
 * @designPattern State Pattern
 * @date 2020.11.12
 */

public class PlayerStateChange {
    public final static PlayerState NORMAL_STATE = new NormalState();
    public final static PlayerState ABNORMAL_STATE = new AbnormalState();
    public final static PlayerState SUPERNORMAL_STATE = new SuperNormalState();

    private final BasketballPlayer player;
    private PlayerState playerState;

    public PlayerStateChange(BasketballPlayer player) {
        this.player = player;
    }

    public PlayerState getPlayerState() {
        return playerState;
    }

    public void setPlayerState(PlayerState playerState) {
        this.playerState = playerState;
        this.playerState.setPlayerState(this);
    }

    public void normal() {
        this.playerState.normal(player);
    }

    public void abnormal() {
        this.playerState.abnormal(player);
    }

    public void superNormal() {
        this.playerState.superNormal(player);
    }
}
