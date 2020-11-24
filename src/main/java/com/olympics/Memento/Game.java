package com.olympics.Memento;

public class Game {

    // 玩家走的步数
    private int playerStep;

    /**
      备份游戏
      @return
     */
    public GameMemento createGameMemento(){
        return new GameMemento(playerStep);
    }

    // 初始化  
    public void play(){
        playerStep = 0;
    }

    /**
     恢复备份
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