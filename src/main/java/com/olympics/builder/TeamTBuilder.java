package com.olympics.builder;

public class TeamTBuilder implements ITeamBuilder {
    Team teamt;

    public TeamTBuilder() {
        teamt = new Team();
    }

    @Override
    public void buildPlayer1() {
        teamt.setPlayer1("老虎");
    }

    @Override
    public void buildPlayer2() {
        teamt.setPlayer2("猎豹");
    }

    @Override
    public Team buildTeam() {
        return this.teamt;
    }
}