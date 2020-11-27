package com.olympics.mvc;

public class MVCPatternDemo {
    public static void main(String[] args) {
        System.out.println("射箭比赛开始！");
        System.out.println("轮到兔子选手");
        System.out.println("目前是第九箭射完之后的成绩");
        //从数据库获取比赛成绩信息
        Player model = retrievePlayerFromDatabase();

        //创建一个视图：把比赛信息输出到控制台
        PlayerView view = new PlayerView();

        PlayerController controller = new PlayerController(model, view);

        controller.updateView();
        System.out.println("下面是射完最后一箭的成绩");
        //更新模型数据
        controller.setPlayerScore("99");

        controller.updateView();
    }

    private static Player retrievePlayerFromDatabase() {
        Player student = new Player();
        student.setName("Rabbit");
        student.setScore("90");
        return student;
    }
}
