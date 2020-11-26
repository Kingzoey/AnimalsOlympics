package com.olympics.memento;

import lombok.Data;

@Data
public class Game {

    // 对局步数
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

     /*
	public void setPlayerStep(int i) {
	}

	public int getPlayerStep() {
		return playerStep;
    }
    */

    public void restore(GameMemento gameMemento){
        this.playerStep = gameMemento.getPlayerSteps();
    }

}