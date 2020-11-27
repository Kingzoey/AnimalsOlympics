package com.olympics.staticfactory;

/**
 * Player的子类，前锋球员，得分防守均衡
 *
 * @author Zhenyu Dong
 * @version 1.0
 * @date 2020.11.11
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
