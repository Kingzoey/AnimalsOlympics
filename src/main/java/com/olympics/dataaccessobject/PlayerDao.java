package com.olympics.dataaccessobject;

import java.util.List;

public interface PlayerDao {

    public List<Player> getAllPlayers();

    public Player getPlayer(int rollNo);

    public void updatePlayer(Player student);

    public void deletePlayer(Player student);

}
