package com.olympics.registry;

/**
 * 日志记录器对象
 * 工厂模式
 */
public class Logger {
    private final String name;

    public Logger(String name) {
        this.name = name;
    }

    public void debug(String description) {
        System.out.println("[DEBUG] " + description);
    }

    public void info(String description) {
        System.out.println("[INFO] " + description);
    }

    public void warning(String description) {
        System.out.println("[WARNING] " + description);
    }

    public void error(String description) {
        System.out.println("[ERROR] " + description);
    }

    public String getName() {
        return name;
    }
}
