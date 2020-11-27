/*
 * @Project : AnimalsOlympics
 * @File    : ObjectPool.java
 * @Author  : 刘文朔(liuwenshuo2000@126.com)
 * @Software: IntelliJ IDEA
 */

package com.olympics.objectpool;

import java.util.Random;
import java.util.Vector;

public abstract class ObjectPool<T> {
    // locked是已占用的对象集合，unlocked是可用对象集合
    protected Vector<T> locked, unlocked;

    public ObjectPool() {
        locked = new Vector<>();
        unlocked = new Vector<>();
    }

    // 创建对象
    protected abstract T create();

    // 释放对象回对象池
    public synchronized void checkIn(T t) {
        locked.remove(t);
        unlocked.add(t);
    }

    // 从对象池获取对象
    public synchronized T checkOut() {
        T t;
        if (unlocked.size() > 0) {
            t = unlocked.remove(new Random().nextInt(unlocked.size()));
            locked.add(t);
            return t;
        }
        // 对象池没有可用对象，创建新对象
        t = create();
        locked.add(t);
        return t;
    }
}