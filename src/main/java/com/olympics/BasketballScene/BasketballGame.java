package com.olympics.BasketballScene;

import java.util.Scanner;

public class BasketballGame extends GameThread {
    private final GameThread game = new GameThread();
    private String key = "prepare";
    private final Scanner read = new Scanner(System.in);
    private final Thread gameThread = new Thread(game);


    public void gameStart() {
        System.out.println("欢迎进入篮球比赛!组建你的球队，设置首发球员，然后开始游戏！");
        System.out.println("游戏过程中，可以使用以下按键达到对游戏的控制：");
        System.out.println("c:更换在场球员");
        System.out.println("t:更换球队战术");
        System.out.println("s:更改球员状态");
        System.out.println("a:恢复游戏(如果没有自动恢复游戏的话，解除以上暂停)");
        System.out.println("输入任意字符开始游戏！");
        String confirm = read.next();
        label:
        while (!confirm.isEmpty()) {
            if (!game.isTeamMake) {
                game.MakeTeam();
                game.isTeamMake = true;
                game.SetPlayerStarted();
                key = "start";
            } else {
                switch (key) {
                    case "start":
                        System.out.println("游戏开始！");
                        gameThread.start();
                        break;
                    case "c":
                        game.suspend();
                        System.out.println("请求更换选手！");
                        game.ChangePlayerOnCourt();
                        game.consume();
                        break;
                    case "t":
                        game.suspend();
                        System.out.println("请求暂停，更换战术！");
                        game.ChangeTactics();
                        game.consume();
                        break;
                    case "s":
                        game.suspend();
                        System.out.println("更改球员状态测试！");
                        game.PlayerStateChange();
                        game.consume();
                        break;
                    case "a":
                        game.consume();
                        break;
                    case "q":
                        game.end();
                        break label;
                }
                key = read.next();
            }
        }
        System.out.println("比赛结束");

    }
}
