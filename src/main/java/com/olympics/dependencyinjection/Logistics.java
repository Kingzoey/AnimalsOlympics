package com.olympics.dependencyinjection;

public class Logistics extends DatabaseClient {

    public void send(String to) {
        System.out.println("物流系统发出包裹, 收件人: " + to);
        conn.query("INSERT INTO logistics VALUES(" + to + ")");
        System.out.println("操作成功");
    }

    public void receive(String from) {
        System.out.println("物流系统收到包裹, 收件人: " + from);
        conn.query("INSERT INTO logistics VALUES(" + from + ")");
        System.out.println("操作成功");
    }
}
