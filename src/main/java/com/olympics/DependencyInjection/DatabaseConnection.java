package com.olympics.DependencyInjection;

public interface DatabaseConnection {

    public void connect();

    public void disconnect();

    public void query(String sql);
}
