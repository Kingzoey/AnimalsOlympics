package com.olympics.Builder;

public class TeamDirector
{
    public Team constructTeam(ITeamBuilder builder)
    {
        builder.buildPlayer1();
        builder.buildPlayer2();
        return builder.buildTeam();
    }
}