package com.olympics.memento;

public class Game {
    /**
     * 对局步数
     */
    private int playerStep;

    public int getPlayerStep() {
        return playerStep;
    }

    public void setPlayerStep(int playerStep) {
        this.playerStep = playerStep;
    }

    /**
     * 备份游戏
     *
     * @return GameMemento
     */
    public GameMemento createGameMemento() {
        return new GameMemento(playerStep);
    }

    // 初始化  
    public void play() {
        playerStep = 0;
    }

    /**
     * 恢复备份
     *
     * @param gameMemento some argument
     */
    public void restore(GameMemento gameMemento) {
        this.playerStep = gameMemento.getPlayerSteps();
    }
}