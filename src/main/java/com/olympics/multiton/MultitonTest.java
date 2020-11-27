package com.olympics.multiton;

/*多例模式*/

public class MultitonTest {
    public static void main(String[] args) {
        System.out.println("比赛即将开始，生成本场比赛裁判！");
        Referee referee = Referee.getInstance(0);
        if (referee != null) {
            System.out.println(referee.toString());
        }
        referee = Referee.getInstance(1);
        if (referee != null) {
            System.out.println(referee.toString());
        }
        referee = Referee.getInstance(2);
        if (referee != null) {
            System.out.println(referee.toString());
        }
        referee = Referee.getInstance(3);
        if (referee != null) {
            System.out.println(referee.toString());
        }
    }
}
