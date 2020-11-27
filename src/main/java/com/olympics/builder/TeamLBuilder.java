package com.olympics.builder;

public class TeamLBuilder implements ITeamBuilder {
    Team teaml;

    public TeamLBuilder() {
        teaml = new Team();
    }

    @Override
    public void buildPlayer1() {
        teaml.setPlayer1("狮子");
    }

    @Override
    public void buildPlayer2() {
        teaml.setPlayer2("大象");
    }

    @Override
    public Team buildTeam() {
        return this.teaml;
    }
}
