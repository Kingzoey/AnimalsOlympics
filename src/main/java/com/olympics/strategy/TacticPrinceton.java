package com.olympics.strategy;

import com.olympics.staticfactory.BasketballPlayer;

/**
 * Tactics接口的实现之一，普林斯顿+紧逼
 *
 * @author Zhenyu Dong
 * @version 1.0
 * @date 2020.11.10
 */

public class TacticPrinceton implements Tactics {
    @Override
    public void arrangeTactics(BasketballPlayer[] players) {
        System.out.println("战术使用：进攻-普林斯顿体系，防守-半场紧逼");
        System.out.println("队内全员进攻、防守属性略微提升！");
        for (BasketballPlayer player : players
        ) {
            if (player != null) {
                player.stateAttackAbility = player.stateAttackAbility * 1.1;
                player.stateDefenseAbility = player.basicDefenseAbility * 1.1;
            }
        }
    }
}
