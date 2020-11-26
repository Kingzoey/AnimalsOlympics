package com.olympics.staticfactory;

/**
 * @className: PlayerForward
 * @author: Zhenyu Dong
 * @description: Player的子类，前锋球员，得分防守均衡
 * @date: 2020.11.11
 * @version: 1.0
 */

public class PlayerForward extends BasketballPlayer {

    public PlayerForward(String name, int age, int number, String position) {
        super(name, age, number);
        this.playerAbilities(position);
        this.playerStateChange.normal();
    }

    @Override
    public void playerAbilities(String position) {
        this.position = position;
        this.basicAttackAbility = 80;
        this.basicDefenseAbility = 80;
    }


}
