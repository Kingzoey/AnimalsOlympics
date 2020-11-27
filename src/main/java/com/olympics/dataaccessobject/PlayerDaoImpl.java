package com.olympics.dataaccessobject;

import java.util.ArrayList;
import java.util.List;

public class PlayerDaoImpl implements PlayerDao {

    /**
     * 将内存中的List作为数据库
     */
    private List<Player> players = new ArrayList<>();

    public PlayerDaoImpl() {
        Player player1 = new Player("Robert", 0);
        Player player2 = new Player("John", 1);
        players.add(player1);
        players.add(player2);
    }

    @Override
    public void deletePlayer(Player Player) {
        players.remove(Player.getRollNo());
        System.out.println("Player: Roll No " + Player.getRollNo() + ", deleted from database");
    }

    //从数据库中检索运动员名单
    @Override
    public List<Player> getAllPlayers() {
        return players;
    }

    @Override
    public Player getPlayer(int rollNo) {
        return players.get(rollNo);
    }

    @Override
    public void updatePlayer(Player Player) {
        players.get(Player.getRollNo()).setName(Player.getName());
        System.out.println("Player: Roll No " + Player.getRollNo() + ", updated in the database");
    }
}
