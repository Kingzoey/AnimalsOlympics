package com.olympics.repository;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/**
 * 资源库模式
 */
public class Repository {
    private Storage persistence;

    public Repository(Storage storage) {
        persistence = storage;
    }

    public void setPersistence(Storage persistence) {
        this.persistence = persistence;
    }

    public Player getById(int id) {
        Map<String, Object> data = persistence.retrieve(id);
        if (data == null) {
            return null;
        }
        Player player = new Player();
        player.setId((Integer) data.get("id"));
        player.setAge((Integer) data.get("age"));
        player.setJoinTime((GregorianCalendar) data.get("join_time"));
        player.setName((String) data.get("name"));
        player.setTeam((String) data.get("team"));
        return player;
    }


    public Player save(Player player) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", player.getId());
        map.put("age", player.getAge());
        map.put("join_time", player.getJoinTime());
        map.put("name", player.getName());
        map.put("team", player.getTeam());
        int id = persistence.persist(map);
        player.setId(id);
        return player;
    }

    public void delete(int id) {
        persistence.delete(id);
    }

    public static void main(String[] args) {
        Storage storage = new MemoryStorage();
        Repository repository = new Repository(storage);

        System.out.println("创建新的Player实例");
        Player player = new Player();
        player.setName("Tom");
        player.setAge(18);
        player.setJoinTime(new GregorianCalendar());
        player.setTeam("T&J");

        System.out.println("将Player实例存储到持久层中");
        repository.save(player);
        int id = player.getId();
        System.out.println("存储完毕, 数据key: " + id);

        System.out.println("从持久层中取出Player实例");
        Player player1 = repository.getById(id);
        System.out.println("取出的实例的name是: " + player1.getName());

        System.out.println("从持久层中删除Player实例");
        repository.delete(id);
        System.out.println("删除成功");
    }
}
