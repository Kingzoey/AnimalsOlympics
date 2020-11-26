package com.olympics.Repository;

import java.util.Map;

/**
 * 持久层存储
 */
public interface Storage {
    /**
     * 存储数据对象
     * @param data
     * @return id
     */
    public int persist(Map<String, Object> data);

    /**
     * 取出数据对象
     * @param id
     * @return Object
     */
    public Map<String, Object> retrieve(int id);

    /**
     * 删除数据对象
     * @param id
     */
    public void delete(int id);
}
