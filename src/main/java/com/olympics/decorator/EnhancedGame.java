/*
 * @Project : AnimalsOlympics
 * @File    : EnhancedGame.java
 * @Author  : 刘文朔(liuwenshuo2000@126.com)
 * @Software: IntelliJ IDEA
 */

package com.olympics.decorator;

public class EnhancedGame extends GameDecorator {
    public static void main(String[] args) {
        EnhancedGame e = new EnhancedGame();
        e.game();
    }

    public EnhancedGame(Game decoratedGame) {
        super(decoratedGame);
    }

    public EnhancedGame() {
        this(new WaterPoloGame());
    }

    @Override
    public boolean game() {
        System.out.println("观众朋友们大家好，欢迎来到动物运动会的水球比赛！");
        boolean result = decoratedGame.game();
        this.gameData = decoratedGame.gameData;
        printData();
        return result;
    }

    @Override
    public void reloadPlayers() {
        decoratedGame.reloadPlayers();
    }

    public void printData() {
        System.out.println("\n数据统计：");
        System.out.println("队伍1  |  队伍2");
        System.out.printf("进球%3d|%-3d进球\n", gameData[0], gameData[3]);
        System.out.printf("出界%3d|%-3d出界\n", gameData[1], gameData[4]);
        System.out.printf("任意%3d|%-3d任意\n", gameData[2], gameData[5]);
    }
}
