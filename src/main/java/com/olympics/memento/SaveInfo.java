package com.olympics.memento;

/*
  备份信息
 */
public class SaveInfo {
    // 备份 
    private GameMemento gameMemento;

    // 恢复备份 
    public GameMemento retrieveMemento() {
        return this.gameMemento;
    }

    // 保存备份
    public void saveMemento(GameMemento gameMemento) {
        this.gameMemento = gameMemento;
    }
}