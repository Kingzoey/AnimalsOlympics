package com.olympics.registry;

import java.util.HashMap;
import java.util.Map;

/**
 * 注册模式
 */
public abstract class Registry {
    protected static Map<String, Object> root = new HashMap<>();

    public static void set(String key, Object value) {
        System.out.println("将对象\"" + key + "\"注册到全局对象树上");
        root.put(key, value);
    }

    public static Object get(String key) {
        System.out.println("从全局对象树上取出对象\"" + key + "\"");
        return root.getOrDefault(key, null);
    }

    public static void main(String[] args) {
        Registry.set("logger", LoggerFactory.createLogger());

        Logger theLogger = (Logger) Registry.get("logger");
        theLogger.debug("I am the logger!");
        theLogger.info(theLogger.getName());

        Logger alsoLogger = (Logger) Registry.get("logger");
        alsoLogger.debug("I am also the logger!");
        alsoLogger.info(alsoLogger.getName());
        if (theLogger == alsoLogger) {
            System.out.println("两个Logger引用指向同一个logger实例");
        }
    }
}
