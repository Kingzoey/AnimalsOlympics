package com.olympics.repository;

import java.util.Map;

/**
 * 持久层存储
 */
public interface Storage {
    /**
     * 存储数据对象
     *
     * @param data some argument
     * @return id
     */
    int persist(Map<String, Object> data);

    /**
     * 取出数据对象
     *
     * @param id some argument
     * @return Object
     */
    Map<String, Object> retrieve(int id);

    /**
     * 删除数据对象
     *
     * @param id some argument
     */
    void delete(int id);
}
