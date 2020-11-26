package com.olympics.dependencyinjection;

public interface DatabaseConnection {

    public void connect();

    public void disconnect();

    public void query(String sql);
}
