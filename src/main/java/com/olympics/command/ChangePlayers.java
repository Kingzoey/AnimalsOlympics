/*
 * @Project : AnimalsOlympics
 * @File    : ChangePlayers.java
 * @Author  : 刘文朔(liuwenshuo2000@126.com)
 * @Software: IntelliJ IDEA
 */

package com.olympics.command;

import com.olympics.decorator.WaterPoloGame;

public class ChangePlayers implements Order {
    public ChangePlayers(WaterPoloGame w) {
        w.ChangePlayers();
        System.out.println("双方更换场上的比赛选手，目前各选手体力状况是：");
    }

    @Override
    public void execute() {

    }
}
