/*
 * @Project : AnimalsOlympics
 * @File    : Game.java
 * @Author  : 刘文朔(liuwenshuo2000@126.com)
 * @Software: IntelliJ IDEA
 */

package com.olympics.decorator;

public abstract class Game {
    int[] gameData;

    public abstract boolean game();

    public abstract void reloadPlayers();
}