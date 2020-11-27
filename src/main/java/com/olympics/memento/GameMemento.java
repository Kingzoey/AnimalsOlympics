package com.olympics.memento;

public class GameMemento {
    private final int playerSteps;

    /**
     * 备份步数
     *
     * @param playerSteps some argument
     */
    public GameMemento(int playerSteps) {
        this.playerSteps = playerSteps;
    }

    public int getPlayerSteps() {
        return playerSteps;
    }
}
