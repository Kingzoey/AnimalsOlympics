package com.olympics.registry;

public class LoggerFactory {
    public static Logger createLogger() {
        return new Logger("default");
    }

    public static Logger createLogger(String name) {
        return new Logger(name);
    }
}
