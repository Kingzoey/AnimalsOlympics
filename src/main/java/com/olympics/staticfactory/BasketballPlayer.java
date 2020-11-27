package com.olympics.staticfactory;

import com.olympics.state.NormalState;
import com.olympics.state.PlayerStateChange;

/**
 * 在篮球场景中，培养球员采用静态工厂模式
 *
 * @author Zhenyu Dong
 * @version 1.0
 * @designPattern Static Factory
 * @date 2020.11.11
 */
public abstract class BasketballPlayer {
    public String name;
    public int age;
    public int number;

    public String position;
    public int basicAttackAbility;
    public int basicDefenseAbility;
    public double stateAttackAbility;
    public double stateDefenseAbility;

    public PlayerStateChange playerStateChange = new PlayerStateChange(this);

    public Boolean isOnCourt = false;
    public Boolean isStarter = false;


    public BasketballPlayer(String name, int age, int number) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.playerStateChange.setPlayerState(new NormalState());
    }

    public abstract void playerAbilities(String position);
}
