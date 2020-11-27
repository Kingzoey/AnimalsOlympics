/*
 * @Project : AnimalsOlympics
 * @File    : WaterPoloGame.java
 * @Author  : 刘文朔(liuwenshuo2000@126.com)
 * @Software: IntelliJ IDEA
 */

package com.olympics.decorator;

import com.olympics.command.*;
import com.olympics.objectpool.*;

import java.util.*;

public class WaterPoloGame extends Game {
    public static void main(String[] args) {
        WaterPoloGame w = new WaterPoloGame();
        w.game();
    }

    SwimmingPool swimmingPool;
    WaterPoloScenePool waterPoloScenePool;
    List<Player> team1;
    List<Player> team2;
    List<Player> substitute1;
    List<Player> substitute2;

    public WaterPoloGame() {
        waterPoloScenePool = new WaterPoloScenePool();
        swimmingPool = waterPoloScenePool.checkOut();
        Random random = new Random();
        team1 = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            Player p = new Player();
            p.weight = random.nextInt(91) + 10;
            p.speed = random.nextInt(51) + 50;
            p.skill = random.nextInt(31) + 60 + (54 - p.weight) / 5;
            p.power = (int) (100 * (random.nextDouble() * 0.75 + 0.75));
            p.id = i % 13 + 1;
            team1.add(p);
        }

        team2 = new ArrayList<>(team1.subList(13, 26));
        team1.subList(13, 26).clear();
        team1.sort(Comparator.comparingInt(p -> -strengthCalculation(p)));
        team2.sort(Comparator.comparingInt(p -> -strengthCalculation(p)));

        Player p1 = team1.stream().filter(p -> p.id == 1).findAny().get();
        p1.id = team1.get(0).id;
        team1.get(0).id = 1;
        p1 = team2.stream().filter(p -> p.id == 1).findAny().get();
        p1.id = team2.get(0).id;
        team2.get(0).id = 1;

        substitute1 = new ArrayList<>(team1.subList(7, 13));
        team1.subList(7, 13).clear();
        substitute2 = new ArrayList<>(team2.subList(7, 13));
        team2.subList(7, 13).clear();
    }

    @Override
    public boolean game() {
        Player p;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("水球比赛准备开始");
        System.out.println("比赛地点为" + swimmingPool.type + "场地");

        System.out.println("双方候补队员之状况：");
        System.out.println("1队编号\t体格\t速度\t技巧\t精力\t\t2队编号\t体格\t速度\t技巧\t精力");
        for (int i = 0; i < 6; i++) {
            p = substitute1.get(i);
            System.out.printf("%2d 号\t%3d\t%3d\t%3d\t%3d\t\t", p.id, p.weight, p.speed, p.skill, p.power);
            p = substitute2.get(i);
            System.out.printf("%2d 号\t%3d\t%3d\t%3d\t%3d", p.id, p.weight, p.speed, p.skill, p.power);
            System.out.println();
        }

        System.out.println("双方首发队员之状况：");
        System.out.println("1队编号\t体格\t速度\t技巧\t精力\t\t2队编号\t体格\t速度\t技巧\t精力");
        for (int i = 0; i < 7; i++) {
            p = team1.get(i);
            System.out.printf("%2d 号\t%3d\t%3d\t%3d\t%3d\t\t", p.id, p.weight, p.speed, p.skill, p.power);
            p = team2.get(i);
            System.out.printf("%2d 号\t%3d\t%3d\t%3d\t%3d", p.id, p.weight, p.speed, p.skill, p.power);
            System.out.println();
        }
        System.out.printf("首发球员竞争力对比：%d ： %d\n", team1.stream().mapToInt(e -> strengthCalculation(e) / 1000).reduce(Integer::sum).getAsInt(), team2.stream().mapToInt(e -> strengthCalculation(e) / 1000).reduce(Integer::sum).getAsInt());

        int score1 = 0, score2 = 0;
        double time = 0;
        boolean attacker;
        int formation1 = random.nextInt(3);
        int formation2 = random.nextInt(3);
        double f1, f2;
        double buff1 = 1, buff2 = 1;
        Map<Player, Integer> working1, working2;
        gameData = new int[6];

        switch (formation1) {
            case 0:
                System.out.println("队伍1采用3-3阵型。");
                f1 = 1;
                break;
            case 1:
                System.out.println("队伍1采用2-2-2阵型。");
                f1 = 0.8;
                break;
            default:
                System.out.println("队伍1采用4-2阵型。");
                f1 = 1.25;
                break;
        }

        switch (formation2) {
            case 0:
                System.out.println("队伍2采用3-3阵型。");
                f2 = 1;
                break;
            case 1:
                System.out.println("队伍2采用2-2-2阵型。");
                f2 = 0.8;
                break;
            default:
                System.out.println("队伍2采用4-2阵型。");
                f2 = 1.25;
                break;
        }
        System.out.println("按下回车开始比赛。");
        scan.nextLine();
        double roundTime;
        for (int round = 1; round < 5; ++round) {
            while (true) {
                roundTime = random.nextDouble() + 0.5;
                time += roundTime;
                try {
                    Thread.sleep((long) (time * 10));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (time > 15) {
                    time = 0;
                    if (round == 4)
                        break;

                    if (round == 2)
                        System.out.println("上半场结束，休息五分钟，双方交换场地。");
                    else {
                        System.out.println("一小节结束，休息两分钟。");
                    }

                    System.out.println("回车停止休息。");
                    scan.nextLine();
                    System.out.println("双方更换球员。");
                    Order o = new ChangePlayers(this);
                    o.execute();
                    System.out.println("队伍一：");
                    for (Player pl : team1) {
                        System.out.printf("%2d号选手-体力值%3d\t", pl.id, pl.power);
                    }
                    System.out.println();
                    System.out.println("队伍二：");
                    for (Player pl : team2) {
                        System.out.printf("%2d号选手-体力值%3d\t", pl.id, pl.power);
                    }
                    System.out.println();
                    System.out.println("回车开始第" + (round + 1) + "小节");
                    scan.nextLine();

                    break;
                }

                attacker = random.nextBoolean();
                working1 = new HashMap<>();
                for (var pl : team1) {
                    if (pl.speed / 200.0 > random.nextDouble()) {
                        int cost = random.nextInt(Math.max(pl.power / 20, 1)) + pl.power / 35;
                        pl.power -= cost;
                        pl.power = Math.max(pl.power, 0);
                        working1.put(pl, cost);
                    } else {
                        pl.power -= random.nextInt(3);
                        pl.power = Math.max(pl.power, 0);
                    }
                }

                working2 = new HashMap<>();
                for (var pl : team2) {
                    if (pl.speed / 200.0 > random.nextDouble()) {
                        int cost = random.nextInt(Math.max(pl.power / 20, 1)) + pl.power / 35;
                        pl.power -= cost;
                        pl.power = Math.max(pl.power, 0);
                        working2.put(pl, cost);
                    } else {
                        pl.power -= random.nextInt(3);
                        pl.power = Math.max(pl.power, 0);
                    }
                }

                double strength1 = 0, strength2 = 0;

                for (var v : working1.entrySet()) {
                    Player pl = v.getKey();
                    strength1 += (pl.weight + pl.speed + pl.skill) * v.getValue();
                }

                for (var v : working2.entrySet()) {
                    Player pl = v.getKey();
                    strength2 += (pl.weight + pl.speed + pl.skill) * v.getValue();
                }

                if (attacker) {
                    strength1 *= f1;
                    strength2 /= f2;
                } else {
                    strength1 /= f1;
                    strength2 *= f2;
                }

                strength1 *= buff1;
                strength2 *= buff2;

                Order nextOrder;
                buff1 = 1;
                buff2 = 1;

                if (strength1 == strength2 && strength1 == 0)
                    continue;
                else if (strength1 == 0) {
                    score2++;
                    buff1 = 1.5;
                    System.out.println("二号队选手" + randomID(working2) + "进球！");
                    gameData[3] += 1;
                    continue;
                } else if (strength2 == 0) {
                    score1++;
                    buff2 = 1.5;
                    System.out.println("一号队选手" + randomID(working1) + "进球！");
                    gameData[0] += 1;
                    continue;
                }

                double result = random.nextDouble();
                if (attacker) {
                    if (result < (strength1 - strength2) * 2 / (strength1 + strength2)) {
                        score1++;
                        nextOrder = new Goal(1, randomID(working1));
                        buff2 = 1.5;
//                        System.out.println("一号队选手" + randomID(working1) + "进球！");
                        gameData[0] += 1;
                    } else if (result < (strength1) / (strength1 + strength2)) {
                        if (random.nextDouble() < 0.15) {
                            buff1 = 2;
                            nextOrder = new Freekicks(2, randomID(working2));
//                            System.out.println("二号队选手" + randomID(working2) + "违规，一号队任意球！");
                            gameData[2] += 1;
                        } else {
                            buff1 = 1.2;
                            nextOrder = new Foul(2, randomID(working2));
//                            System.out.println("二号队选手" + randomID(working2) + "出界！");
                            gameData[4] += 1;
                        }
                    } else {
                        if (random.nextDouble() < 0.15) {
                            buff2 = 2;
                            nextOrder = new Freekicks(1, randomID(working1));
//                            System.out.println("一号队选手" + randomID(working2) + "违规，二号队任意球！");
                            gameData[5] += 1;
                        } else {
                            buff2 = 1.2;
                            nextOrder = new Foul(1, randomID(working1));
//                            System.out.println("一号队选手" + randomID(working1) + "出界！");
                            gameData[1] += 1;
                        }
                    }
                } else {
                    if (result < (strength2 - strength1) * 2 / (strength1 + strength2)) {
                        score2++;
                        buff1 = 1.5;
                        nextOrder = new Goal(2, randomID(working2));
//                        System.out.println("二号队选手" + randomID(working2) + "进球！");
                        gameData[3] += 1;
                    } else if (result < (strength1) / (strength1 + strength2)) {
                        if (random.nextDouble() < 0.15) {
                            buff2 = 2;
                            nextOrder = new Freekicks(1, randomID(working1));
//                            System.out.println("一号队选手" + randomID(working2) + "违规，二号队任意球！");
                            gameData[5] += 1;
                        } else {
                            buff2 = 1.2;
                            nextOrder = new Foul(1, randomID(working1));
//                            System.out.println("一号队选手" + randomID(working1) + "出界！");
                            gameData[1] += 1;
                        }
                    } else {
                        if (random.nextDouble() < 0.15) {
                            buff1 = 2;
                            nextOrder = new Freekicks(2, randomID(working2));
//                            System.out.println("二号队选手" + randomID(working2) + "违规，一号队任意球！");
                            gameData[2] += 1;
                        } else {
                            buff1 = 1.2;
                            nextOrder = new Foul(2, randomID(working2));
//                            System.out.println("二号队选手" + randomID(working2) + "出界！");
                            gameData[4] += 1;
                        }
                    }
                }
                nextOrder.execute();
            }
        }

        System.out.printf("比分为\t%-3d：%3d\n", score1, score2);
        return score1 > score2;
    }

    public void changePool() {
        waterPoloScenePool.checkIn(swimmingPool);
        swimmingPool = waterPoloScenePool.checkOut();
        System.out.println("更换场地为" + swimmingPool + "场地");
    }

    @Override
    public void reloadPlayers() {
        Random random = new Random();
        team1.addAll(substitute1);
        team2.addAll(substitute2);
        for (var p : team1) {
            p.power = (int) (100 * (random.nextDouble() * 0.75 + 0.75));
        }

        for (var p : team2) {
            p.power = (int) (100 * (random.nextDouble() * 0.75 + 0.75));
        }

        team1.sort(Comparator.comparingInt(p -> -strengthCalculation(p)));
        team2.sort(Comparator.comparingInt(p -> -strengthCalculation(p)));

        substitute1 = new ArrayList<>(team1.subList(7, 13));
        team1.subList(7, 13).clear();
        substitute2 = new ArrayList<>(team2.subList(7, 13));
        team2.subList(7, 13).clear();
        System.out.println("运动员休息完毕，按回车开始继续运动。");
        Scanner sca = new Scanner(System.in);
        sca.nextLine();
    }

    public void ChangePlayers() {
        team1.addAll(substitute1);
        team2.addAll(substitute2);

        team1.sort(Comparator.comparingInt(p -> -strengthCalculation(p)));
        team2.sort(Comparator.comparingInt(p -> -strengthCalculation(p)));

        substitute1 = new ArrayList<>(team1.subList(7, 13));
        team1.subList(7, 13).clear();
        substitute2 = new ArrayList<>(team2.subList(7, 13));
        team2.subList(7, 13).clear();
    }

    public static int strengthCalculation(Player p) {
        return (p.weight + p.speed + p.skill) * p.power;
    }

    public static int strengthCalculation2(Player p) {
        return (p.weight + p.speed + p.skill);
    }

    public static int randomID(Map<Player, Integer> working) {
        return new ArrayList<>(working.keySet()).get(new Random().nextInt(working.size())).id;
    }
}
