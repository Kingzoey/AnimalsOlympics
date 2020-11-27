/*
 * @Project : AnimalsOlympics
 * @File    : SwimmingPool.java
 * @Author  : 刘文朔(liuwenshuo2000@126.com)
 * @Software: IntelliJ IDEA
 */

package com.olympics.objectpool;

public class SwimmingPool {
    public boolean available = true;
    public SwimmingPoolType type;

    public SwimmingPool(SwimmingPoolType type) {
        this.type = type;
    }
}

enum SwimmingPoolType {
    Sea("海洋"), Lake("湖泊"), River("河流"), Pool("人工");
    private final String name;

    SwimmingPoolType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}