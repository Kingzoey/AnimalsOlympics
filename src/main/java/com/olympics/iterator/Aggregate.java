package com.olympics.iterator;

/**
 * 只有实现此接口的才可以获得迭代器对象
 */
public interface Aggregate {
    /**
     * 获得迭代器对象
     *
     * @return some object
     */
    Iterator iterator();
}