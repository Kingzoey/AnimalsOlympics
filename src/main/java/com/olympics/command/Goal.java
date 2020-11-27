/*
 * @Project : AnimalsOlympics
 * @File    : Goal.java
 * @Time    : 2020/11/27 10:19
 * @Author  : 刘文朔(liuwenshuo2000@126.com)
 * @Software: IntelliJ IDEA
 */

package com.olympics.command;

public class Goal implements Order {
    int team, id;

    public Goal(int team, int id) {
        this.team = team;
        this.id = id;
    }

    @Override
    public void execute() {
        char[] c12 = new char[]{'一', '二'};
        System.out.println(c12[team - 1] + "号队选手" + id + "进球！");
    }
}
