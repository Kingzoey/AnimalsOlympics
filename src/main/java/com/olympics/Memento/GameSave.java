package com.olympics.Memento;

/**
 * 备份
 */
@Getter
public class GameMemento {
    /** 步数 */
    private int playerSteps;

    /**
     * 备份步数
     * @param playerSteps
     */
    public GameMemento(int playerSteps){
        this.playerSteps = playerSteps;
        this.x = savex;
        this.y = savey;
    }

}