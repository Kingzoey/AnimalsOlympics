package com.olympics.repository;

import java.util.Calendar;

/**
 *
 */
public class Player {
    private int id;
    private String name;
    private int age;
    private Calendar joinTime;
    private String team;

    public String getName() {
        return name;
    }

    public Calendar getJoinTime() {
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

    public void setJoinTime(Calendar joinTime) {
        this.joinTime = joinTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}

