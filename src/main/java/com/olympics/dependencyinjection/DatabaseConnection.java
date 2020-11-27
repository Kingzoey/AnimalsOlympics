package com.olympics.dependencyinjection;

public interface DatabaseConnection {

    void connect();

    void disconnect();

    void query(String sql);
}
