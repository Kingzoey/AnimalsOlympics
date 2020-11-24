package com.olympics.State;

import com.olympics.StaticFactory.BasketballPlayer;

/**
 * @className: SuperNormalState
 * @author: Zhenyu Dong
 * @description: PlayerState的子类，超常状态，设置属性及转变方法
 * @designPattern: State Pattern
 * @date: 2020.11.12
 * @version: 1.0
 */

public class SuperNormalState extends PlayerState {
    @Override
    public void normal(BasketballPlayer player) {
        System.out.println(player.name + " 由超常状态变为正常状态：");
        super.playerStateChange.setPlayerState(PlayerStateChange.NORMAL_STATE);
        super.playerStateChange.getPlayerState().normal(player);
    }

    @Override
    public void abnormal(BasketballPlayer player) {
        System.out.println(player.name + " 由超常状态变为失常状态：");
        super.playerStateChange.setPlayerState(PlayerStateChange.ABNORMAL_STATE);
        super.playerStateChange.getPlayerState().abnormal(player);
    }

    @Override
    public void superNormal(BasketballPlayer player) {
        System.out.println("球员:" + player.name + "现在是超常状态！");
        player.stateAttackAbility = 1.2 * player.basicAttackAbility;
        player.stateDefenseAbility = 1.2 * player.basicDefenseAbility;
    }
}