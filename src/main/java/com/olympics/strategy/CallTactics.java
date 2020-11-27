package com.olympics.strategy;

import com.olympics.staticfactory.BasketballPlayer;

/**
 * 呼叫战术，使用战术的类
 *
 * @author Zhenyu Dong
 * @version 1.0
 * @designPattern Strategy
 * @date 2020.11.10
 */

public class CallTactics {
    private Tactics tactics;

    enum TacticsType {
        NULL, Princeton, RunGun, Singles
    }

    // ??? 是否已经将策略模式和简单工厂模式结合？
    public CallTactics(int type) {
        if (type == TacticsType.Princeton.ordinal()) {
            this.tactics = new TacticPrinceton();
        } else if (type == TacticsType.RunGun.ordinal()) {
            this.tactics = new TacticRunGun();
        } else if (type == TacticsType.Singles.ordinal()) {
            this.tactics = new TacticSingles();
        }
    }

    public void executeTactic(BasketballPlayer[] players) {
        tactics.arrangeTactics(players);
        System.out.println("战术使用成功！");
    }
}
