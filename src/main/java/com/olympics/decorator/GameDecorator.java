/*
 * @Project : AnimalsOlympics
 * @File    : GameDecorator.java
 * @Author  : 刘文朔(liuwenshuo2000@126.com)
 * @Software: IntelliJ IDEA
 */

package com.olympics.decorator;

public abstract class GameDecorator extends Game {
    protected Game decoratedGame;

    public GameDecorator(Game decoratedGame) {
        this.decoratedGame = decoratedGame;
    }

    @Override
    public boolean game() {
        return decoratedGame.game();
    }
}
