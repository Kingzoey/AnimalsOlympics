package com.olympics.dependencyinjection;

public class DependencyInjection {

    public static void main(String[] args) {
        System.out.println("------创建数据库连接对象------");
        DatabaseConnection conn = new MysqlDatabaseConnection();
        conn.connect();

        System.out.println("比赛模块启动");
        Competition client1 = new Competition("乒乓球");

        System.out.println("仓储模块启动");
        Warehouse client2 = new Warehouse();

        System.out.println("物流模块启动");
        Logistics client3 = new Logistics();

        System.out.println("------注入数据库连接对象------");
        client1.setConn(conn);
        client2.setConn(conn);
        client3.setConn(conn);

        System.out.println("------开始执行业务逻辑------");
        client1.start();

        client2.store("Football");
        client2.load("Football");

        client3.send("Trump");
        client3.receive("Trump");

        System.out.println("------业务逻辑结束------");

        System.out.println("------销毁数据库连接对象------");
    }
}
