package com.olympics.transferobject;

public class TransferObjectPatternDemo {
    public static void main(String[] args) {
        PlayerBO playerBusinessObject = new PlayerBO();
        System.out.println("输出数据库现有运动员比赛信息：");
        //输出所有运动员
        for (PlayerVO player : playerBusinessObject.getAllPlayers()) {
            System.out.println("Player: [Num : "
                + player.getRollNo() + ", Name : " + player.getName() + ", Game : " + player.getGame() + ", Time : " + player.getTime() + " ]");
        }
        System.out.println("现更新参赛号码为0的运动员信息：将老虎改成猎豹");
        //更新运动员
        PlayerVO player = playerBusinessObject.getPlayer(0);
        player.setName("猎豹");
        playerBusinessObject.updatePlayer(player);

        System.out.println("更新后的数据库现有运动员比赛信息：");
        //输出更新后的所有运动员
        for (PlayerVO player2 : playerBusinessObject.getAllPlayers()) {
            System.out.println("Player: [Num : "
                + player2.getRollNo() + ", Name : " + player2.getName() + ", Game : " + player2.getGame() + ", Time : " + player2.getTime() + " ]");
        }
    }
}
