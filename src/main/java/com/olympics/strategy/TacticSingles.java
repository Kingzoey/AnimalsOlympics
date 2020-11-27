package com.olympics.strategy;

import com.olympics.staticfactory.BasketballPlayer;

/**
 * Tactics接口的实现之一，单打+包夹
 *
 * @author Zhenyu Dong
 * @version 1.0
 * @date 2020.11.10
 */

public class TacticSingles implements Tactics {
    @Override
    public void arrangeTactics(BasketballPlayer[] players) {
        System.out.println("战术使用：进攻-单打，防守-包夹持球人");
        System.out.println("队内后卫、锋线进攻属性提升，防守属性下降；中锋进攻属性下降，防守属性提升！");
        for (BasketballPlayer player : players) {
            if (player != null) {
                if (player.position.equals("Center")) {
                    player.stateAttackAbility = player.stateAttackAbility * 0.8;
                    player.stateDefenseAbility = player.basicDefenseAbility * 1.5;
                } else {
                    player.stateAttackAbility = player.basicAttackAbility * 1.3;
                    player.stateDefenseAbility = player.basicDefenseAbility * 0.7;
                }
            }
        }
    }
}
