package com.olympics.iterator;

public class Match {

    //比赛名称
    private final String name;

    public Match(String name) {
        this.name = name;
    }

    /**
     * 获得比赛名称
     *
     * @return Match Name
     */
    public String getName() {
        return name;
    }
}