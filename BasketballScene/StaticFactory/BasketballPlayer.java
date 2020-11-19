package com.basketballScene;

/**
 * @className: BasketballPlayer
 * @author: Zhenyu Dong
 * @description: 在篮球场景中，培养球员采用静态工厂模式
 * @designPattern: Static Factory
 * @date: 2020.11.11
 * @version: 1.0
 */

public abstract class BasketballPlayer {
    public String name = "";
    public int age;
    public int number;

    protected String position;
    protected int basicAttackAbility;
    protected int basicDefenseAbility;
    protected double stateAttackAbility;
    protected double stateDefenseAbility;

    protected PlayerStateChange state = new PlayerStateChange(this);

    protected Boolean isOnCourt = false;
    protected Boolean isStarter = false;


    public BasketballPlayer(String name,int age,int number) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.state.setPlayerState(new NormalState());
    }


    public abstract void playerAbilities(String position);
}
