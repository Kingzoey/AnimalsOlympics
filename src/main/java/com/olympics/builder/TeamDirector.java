package com.olympics.builder;

public class TeamDirector {
    public Team TeamL(ITeamBuilder builder) {
        builder.buildPlayer1();
        builder.buildPlayer2();
        return builder.buildTeam();
    }

    public Team TeamT(ITeamBuilder builder) {
        builder.buildPlayer1();
        builder.buildPlayer2();
        return builder.buildTeam();
    }
}