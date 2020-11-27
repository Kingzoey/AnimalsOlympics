package com.olympics.composite;

public class CompositeTest {
    public static void main(String[] args) {
        System.out.println("Let's see the composition of rabbit soccor team!");
        Member member1 = new Member("rabbit1");
        Member member2 = new Member("rabbit2");
        Member member3 = new Member("rabbit3");
        Team team0 = new Team("TotalTeam");
        Team team1 = new Team("team1");
        Team team2 = new Team("team2");
        team0.AddNode(team1);
        team0.AddNode(team2);
        team1.AddNode(member1);
        team1.AddNode(member2);
        team2.AddNode(member3);
        team0.show();
    }
}
