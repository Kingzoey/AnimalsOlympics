package com.olympics.transferobject;

public class PlayerVO {
    private String name;
    private int rollNo;
    private String game;
    private String time;

    PlayerVO(String name, int rollNo, String game, String time) {
        this.name = name;
        this.rollNo = rollNo;
        this.game = game;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
