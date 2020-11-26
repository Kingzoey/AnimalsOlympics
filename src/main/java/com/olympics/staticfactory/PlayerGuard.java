package com.olympics.staticfactory;

/**
 * @className: PlayerGuard
 * @author: Zhenyu Dong
 * @description: Player的子类，后卫球员，得分强防守弱
 * @date: 2020.11.11
 * @version: 1.0
 */

public class PlayerGuard extends BasketballPlayer {

    public PlayerGuard(String name, int age, int number, String position) {
        super(name, age, number);
        this.playerAbilities(position);
        this.playerStateChange.normal();
    }

    @Override
    public void playerAbilities(String position) {
        this.position = position;
        this.basicAttackAbility = 100;
        this.basicDefenseAbility = 60;
    }

}
