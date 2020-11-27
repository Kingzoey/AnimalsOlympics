package com.olympics.dependencyinjection;

/**
 * 依赖于数据库连接的类, 用于依赖注入
 */
public class DatabaseClient {
    protected DatabaseConnection conn;

    /**
     * 注入数据库连接对象
     *
     * @param conn some argument
     */
    public void setConn(DatabaseConnection conn) {
        this.conn = conn;
    }
}
