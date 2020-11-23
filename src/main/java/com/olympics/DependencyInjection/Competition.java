package com.olympics.DependencyInjection;

import java.util.Timer;
import java.util.TimerTask;

public class Competition {
    private DatabaseConnection conn;

    public void setConn(DatabaseConnection conn) {
        this.conn = conn;
    }
    
    public void start() {
        System.out.println("比赛正在进行中");
        System.out.println("比赛结束, 保存比赛结果至数据库");
        conn.query("INSERT INTO result VALUES(1)");
        System.out.println("保存成功");
    }

    public static void main(String[] args) {
        System.out.println("创建数据库连接对象");
        DatabaseConnection conn = new DatabaseConnection();
        
        Competition comp = new Competition();
        comp.setConn(conn);
        comp.start();

        System.out.println("销毁数据库连接对象");
    }
}
