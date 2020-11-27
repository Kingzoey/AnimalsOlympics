package com.olympics.dependencyinjection;

public class MysqlDatabaseConnection implements DatabaseConnection {
    boolean isConnect = false;

    @Override
    public void connect() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isConnect = true;
        System.out.println("MySQL数据库连接成功");
    }

    @Override
    public void disconnect() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isConnect = false;
        System.out.println("MySQL数据库断开连接成功");
    }

    @Override
    public void query(String sql) {
        System.out.println("MySQL数据库正在执行SQL语句");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MySQL数据库执行SQL语句成功");
    }
}
