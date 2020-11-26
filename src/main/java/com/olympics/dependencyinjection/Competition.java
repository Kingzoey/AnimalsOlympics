package com.olympics.dependencyinjection;

public class Competition extends DatabaseClient {
    private final String name;

    public Competition(String name) {
        this.name = name;
        System.out.println(name + " 比赛即将开始");
    }

    public void start() {
        System.out.println(name + " 比赛正在进行中");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " 比赛圆满结束, 保存比赛结果至数据库");
        saveResult();
    }

    public void saveResult() {
        conn.query("INSERT INTO result VALUES(1)");
        System.out.println("比赛结果保存成功");
    }
}
