package com.olympics.iterator;

/**
 * 迭代器接口
 */
public interface Iterator {

    /**
     * 检测是否还有下一个元素
     *
     * @return some object
     */
    boolean hasNext();

    /**
     * 获得下一个元素
     *
     * @return some object
     */
    Object next();

}