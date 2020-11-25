package com.olympics.Memento;

// 备份

import lombok.Getter;

@Getter
public class GameMemento {
    private final int playerSteps;

    /**
     备份步数 
     * @param playerSteps
     */
    public GameMemento(int playerSteps) {
        this.playerSteps = playerSteps;
    }

}