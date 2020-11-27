package com.olympics.dataaccessobject;

public class DaoPatternTest {
    public static void main(String[] args) {
        PlayerDao PlayerDao = new PlayerDaoImpl();

        //输出所有的运动员
        for (Player Player : PlayerDao.getAllPlayers()) {
            System.out.println("Player: [RollNo : " + Player.getRollNo() + ", Name : " + Player.getName() + " ]");
        }

        //更新运动员
        Player Player = PlayerDao.getAllPlayers().get(0);
        Player.setName("Michael");
        PlayerDao.updatePlayer(Player);

        //获取运动员
        PlayerDao.getPlayer(0);
        System.out.println("Player: [RollNo : " + Player.getRollNo() + ", Name : " + Player.getName() + " ]");
    }
}
