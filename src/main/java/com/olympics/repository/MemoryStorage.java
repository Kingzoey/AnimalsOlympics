package com.olympics.repository;

import java.util.HashMap;
import java.util.Map;

/**
 * 数据持久层——内存
 */
public class MemoryStorage implements Storage {
    private final HashMap<Integer, Map<String, Object>> repo = new HashMap<>();
    private Integer lastId = 0;

    /**
     * 存储数据对象
     *
     * @param data some argument
     * @return id
     */
    @Override
    public int persist(Map<String, Object> data) {
        repo.put(lastId, data);
        return lastId++;
    }

    /**
     * 取出数据对象
     *
     * @param id some argument
     * @return Object
     */
    @Override
    public Map<String, Object> retrieve(int id) {
        return repo.getOrDefault(id, null);
    }

    /**
     * 删除数据对象
     *
     * @param id some argument
     */
    @Override
    public void delete(int id) {
        repo.remove(id);
    }
}
