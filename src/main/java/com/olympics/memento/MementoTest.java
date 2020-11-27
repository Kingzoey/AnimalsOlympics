package com.olympics.memento;

import java.util.Random;

/*备忘录模式*/

public class MementoTest {

    public static void main(String[] args) {

        Game game = new Game();
        Random random = new Random();
        int radom = random.nextInt(100);
        System.out.println("游戏开始，随机模拟下棋");
        System.out.println("模拟下棋" + radom + "步");
        game.setPlayerStep(radom);
        // 备份当前状态
        System.out.println("备份当前对局状态");
        GameMemento gameMemento = game.createGameMemento();

        SaveInfo SaveInfo = new SaveInfo();

        SaveInfo.saveMemento(gameMemento);
        System.out.println("备份完成");
        game.play();
        System.out.println("要求留局，清空当前对局，清空后步数为：" + game.getPlayerStep());
        System.out.println("还原到之前一步");
        game.restore(SaveInfo.retrieveMemento());

        System.out.println("恢复完成，当前对局步数是：" + game.getPlayerStep());

    }

}