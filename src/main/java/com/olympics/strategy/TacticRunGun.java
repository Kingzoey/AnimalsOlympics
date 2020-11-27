package com.olympics.strategy;

import com.olympics.staticfactory.BasketballPlayer;

/**
 * Tactics接口的实现之一，跑轰+3-2联防
 *
 * @author Zhenyu Dong
 * @version 1.0
 * @date 2020.11.10
 */

public class TacticRunGun implements Tactics {
    @Override
    public void arrangeTactics(BasketballPlayer[] players) {
        System.out.println("战术使用：进攻-跑轰，防守-32联防");
        System.out.println("队内全员进攻属性略微提升，防守属性略微下降！");
        for (BasketballPlayer player : players) {
            if (player != null) {
                player.stateAttackAbility = player.stateAttackAbility * 1.2;
                player.stateDefenseAbility = player.basicDefenseAbility * 0.8;
            }
        }
    }
}
