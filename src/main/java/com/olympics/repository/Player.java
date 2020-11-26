package com.olympics.repository;

import java.util.Date;

/**
 *
 */
public class Player {
    private int id;
    private String name;
    private int age;
    private Date joinTime;
    private String team;

    public String getName() {
        return name;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getTeam() {
        return team;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}

