package com.olympics.state;

import com.olympics.staticfactory.BasketballPlayer;

/**
 * PlayerState的子类，正常状态，设置属性及转变方法
 *
 * @author Zhenyu Dong
 * @version 1.0
 * @designPattern State Pattern
 * @date 2020.11.12
 */

public class NormalState extends PlayerState {

    @Override
    public void normal(BasketballPlayer player) {
        System.out.println(player.name + " 球员现在处于正常状态！");
        player.stateAttackAbility = 1.0 * player.basicAttackAbility;
        player.stateDefenseAbility = 1.0 * player.basicDefenseAbility;
    }

    @Override
    public void abnormal(BasketballPlayer player) {
        System.out.println(player.name + " 由正常状态变为失常状态：");
        super.playerStateChange.setPlayerState(PlayerStateChange.ABNORMAL_STATE);
        super.playerStateChange.getPlayerState().abnormal(player);
    }

    @Override
    public void superNormal(BasketballPlayer player) {
        System.out.println(player.name + " 由正常状态变为超常状态：");
        super.playerStateChange.setPlayerState(PlayerStateChange.SUPERNORMAL_STATE);
        super.playerStateChange.getPlayerState().superNormal(player);
    }
}
