package com.olympics.Memento;

/**
 * 游戏
 */

public class Game {

    /**
     * 玩家走的步数
     */
    private int playerStep;

    /**
     * 备份游戏
     * @return
     */
    public GameMemento createGameMemento(){
        return new GameMemento(playerStep);
    }

    /**
     * 开始玩游戏
     */
    public void play(){
        playerStep = 0;
    }

    /**
     * 恢复备份
     * @param gameMemento
     */

	public void setPlayerStep(int i) {
	}

	public String getPlayerStep() {
		return null;
	}

    public void restore(GameMemento gameMemento){
        this.playerStep = gameMemento.getPlayerStep();
    }

}