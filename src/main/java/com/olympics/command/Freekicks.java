/*
 * @Project : AnimalsOlympics
 * @File    : Freekicks.java
 * @Author  : 刘文朔(liuwenshuo2000@126.com)
 * @Software: IntelliJ IDEA
 */

package com.olympics.command;

public class Freekicks implements Order {
    int team, id;

    public Freekicks(int team, int id) {
        this.team = team;
        this.id = id;
    }

    @Override
    public void execute() {
        char[] c12 = new char[]{'一', '二'};
        System.out.println(c12[team - 1] + "号队选手" + id + "违规，" + c12[2 - team] + "号队任意球！");
    }
}
