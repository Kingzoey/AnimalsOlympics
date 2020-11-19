package com.basketballScene;

/**
 * @className: PlayerStateChange
 * @author: Zhenyu Dong
 * @description: 实现球员状态变化的控制
 * @designPattern: State Pattern
 * @date: 2020.11.12
 * @version: 1.0
 */

public class PlayerStateChange {
    public final static PlayerState NORMAL_STATE = new NormalState();
    public final static PlayerState ABNORMAL_STATE = new AbNormalState();
    public final static PlayerState SUPERNORMAL_STATE = new SuperNormalState();

    private BasketballPlayer player;
    private PlayerState playerState;

    public  PlayerStateChange(BasketballPlayer player) {
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
