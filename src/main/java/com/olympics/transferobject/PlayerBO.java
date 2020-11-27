package com.olympics.transferobject;

import java.util.ArrayList;
import java.util.List;

public class PlayerBO {
    List<PlayerVO> players;

    public PlayerBO() {
        players = new ArrayList<>();
        PlayerVO player1 = new PlayerVO("老虎", 0, "乒乓球", "2020-10-10");
        PlayerVO player2 = new PlayerVO("狮子", 1, "篮球", "2020-10-11");
        PlayerVO player3 = new PlayerVO("大象", 2, "举重", "2020-10-13");
        PlayerVO player4 = new PlayerVO("狗", 3, "跑步", "2020-10-14");
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
    }

    public void deletePlayer(PlayerVO player) {
        players.remove(player.getRollNo());
        System.out.println("Player: Num: "
            + player.getRollNo() + " " + player.getName() + ", deleted from database");
    }

    //从数据库中检索学生名单
    public List<PlayerVO> getAllPlayers() {
        return players;
    }

    public PlayerVO getPlayer(int rollNo) {
        return players.get(rollNo);
    }

    public void updatePlayer(PlayerVO player) {
        players.get(player.getRollNo()).setName(player.getName());
        System.out.println("Playero: Num: "
            + player.getRollNo() + " " + player.getName() + ", updated in the database");
    }
}
