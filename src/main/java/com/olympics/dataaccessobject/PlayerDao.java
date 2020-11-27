package com.olympics.dataaccessobject;

import java.util.List;

public interface PlayerDao {

    List<Player> getAllPlayers();

    Player getPlayer(int rollNo);

    void updatePlayer(Player student);

    void deletePlayer(Player student);

}
