package com.olympics.dependencyinjection;

public class Warehouse extends DatabaseClient {

    public void load(String item) {
        System.out.println("将" + item + "从仓库中取出");
        conn.query("DELETE FROM warehouse VALUES(" + item + ")");
        System.out.println("操作成功");
    }

    public void store(String item) {
        System.out.println("将" + item + "存储至仓库中");
        conn.query("INSERT INTO warehouse VALUES(" + item + ")");
        System.out.println("操作成功");
    }
}
