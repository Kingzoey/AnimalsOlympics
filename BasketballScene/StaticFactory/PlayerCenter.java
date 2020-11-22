package com.basketballScene;

/**
 * @className: PlayerCenter
 * @author: Zhenyu Dong
 * @description: Player的子类，中锋球员，得分弱防守强
 * @date: 2020.11.11
 * @version: 1.0
 */

public class PlayerCenter extends BasketballPlayer{

    public PlayerCenter(String name, int age,int number,String position) {
        super(name, age,number);
        this.playerAbilities(position);
        this.state.normal();
    }

    @Override
    public void playerAbilities(String position) {
        this.position = position;
        this.basicAttackAbility = 60;
        this.basicDefenseAbility = 100;
    }
}
