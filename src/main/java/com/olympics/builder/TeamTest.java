package com.olympics.builder;

public class TeamTest {
    public static void main(String[] args) {
        TeamDirector director = new TeamDirector();
        Team teaml = director.TeamL(new TeamLBuilder());
        Team teamt = director.TeamT(new TeamTBuilder());
        System.out.println("动物运动会乒乓球双打比赛现在开始！");
        System.out.println("现在请两队派出各自的两名球员");
        System.out.println("第一队的两名球员是：");
        System.out.println(teaml.getPlayer1());
        System.out.println(teaml.getPlayer2());
        System.out.println("第二队的两名球员是：");
        System.out.println(teamt.getPlayer1());
        System.out.println(teamt.getPlayer2());
        System.out.println("乒乓球双打比赛正式开始！！");
    }
}