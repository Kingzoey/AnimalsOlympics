package com.olympics.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * 数据持久层——内存
 */
public class MemoryStorage implements Storage {
    private final HashMap<Integer, Map<String, Object>> repo;
    private Integer lastId = 0;

    MemoryStorage() {
        repo = new HashMap<>();
        lastId = 0;
    }

    /**
     * 存储数据对象
     *
     * @param data
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
     * @param id
     * @return Object
     */
    @Override
    public Map<String, Object> retrieve(int id) {
        return repo.getOrDefault(id, null);
    }

    /**
     * 删除数据对象
     *
     * @param id
     */
    @Override
    public void delete(int id) {
        repo.remove(id);
    }
}
