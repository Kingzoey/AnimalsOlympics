package com.olympics.Memento;

public class MementoTest {

    public static void main(String[] args) {

        Game game = new Game();
        System.out.println("游戏开始，模拟下棋10步");
        game.setPlayerStep(10);
        // 备份当前状态
        System.out.println("备份当前状态");
        GameMemento gameMemento = game.createGameMemento();

        SaveInfo SaveInfo = new SaveInfo();

        SaveInfo.saveMemento(gameMemento);
        System.out.println("备份完成");
        game.play();
        System.out.println("要求悔棋，当前步数为：" + game.getPlayerStep());
        System.out.println("还原到之前一步");
        game.restore(SaveInfo.retrieveMemento());

        System.out.println("恢复完成，当前对局步数是：" + game.getPlayerStep());

    }

}