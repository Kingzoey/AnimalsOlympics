/*
 * @Project : AnimalsOlympics
 * @File    : WaterPoloAdapter.java
 * @Author  : 刘文朔(liuwenshuo2000@126.com)
 * @Software: IntelliJ IDEA
 */

package com.olympics.adapter;

import com.olympics.decorator.Game;

public class WaterPoloAdapter implements Training {
    Game game;
    int round;

    public WaterPoloAdapter(Game g, int round) {
        game = g;
        this.round = round;
    }

    @Override
    public void train() {
        game.game();
        for (int i = 1; i < round; i++) {
            game.reloadPlayers();
            game.game();
        }
    }
}
