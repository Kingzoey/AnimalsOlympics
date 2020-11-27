package com.olympics.state;

import com.olympics.staticfactory.BasketballPlayer;

/**
 * PlayerState的子类，失常状态，设置属性及转变方法
 *
 * @author Zhenyu Dong
 * @version 1.0
 * @designPattern State Pattern
 * @date 2020.11.12
 */

public class AbnormalState extends PlayerState {
    @Override
    public void normal(BasketballPlayer player) {
        System.out.println(player.name + " 由失常状态变为正常状态：");
        super.playerStateChange.setPlayerState(PlayerStateChange.NORMAL_STATE);
        super.playerStateChange.getPlayerState().normal(player);
    }

    @Override
    public void abnormal(BasketballPlayer player) {
        System.out.println(player.name + "球员现在处于失常状态！");
        player.stateAttackAbility = 0.8 * player.basicAttackAbility;
        player.stateDefenseAbility = 0.8 * player.basicDefenseAbility;
    }

    @Override
    public void superNormal(BasketballPlayer player) {
        System.out.println(player.name + " 由失常状态转化为超常状态：");
        super.playerStateChange.setPlayerState(PlayerStateChange.SUPERNORMAL_STATE);
        super.playerStateChange.getPlayerState().superNormal(player);
    }
}
