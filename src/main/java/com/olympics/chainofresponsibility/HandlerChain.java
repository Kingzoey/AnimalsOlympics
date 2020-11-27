package com.olympics.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HandlerChain {
    // 持有所有Handler:
    private final List<Handler> handlers = new ArrayList<>();

    public void addHandler(Handler handler) {
        this.handlers.add(handler);
    }

    public double process(Segment segment) {
        double sum = 0;
        // 依次调用每个Handler:
        for (Handler handler : handlers) {
            double r = handler.process(segment);
            System.out.println("用时" + r + "秒");
            sum += r;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("正在进行4人接力比赛");

        ArrayList<Athlete> team = new ArrayList<>();
        team.add(new Rabbit("Buggy", 10));
        team.add(new Turtle("Double", 3));
        team.add(new Tiger("Tiger", 10));
        team.add(new Tiger("Pupu", 8));

        HandlerChain chain = new HandlerChain();

        System.out.println("当前参赛队员信息如下：");
        System.out.println("Pos.\tSpecies\t\tName\tSpeed");
        for (int i = 0; i < team.size(); i++) {
            Athlete athlete = team.get(i);
            System.out.println((i + 1) + "\t\t" + athlete.getClass().getSimpleName() + "\t\t" + athlete.name + "\t" + athlete.getSpeed());
            chain.addHandler((Handler) athlete);
        }

        System.out.println("------请输入每个赛程的米数------");
        int meters = read.nextInt();
        Segment segment = new Segment(meters);
        System.out.println("------开始比赛------");
        double time = chain.process(segment);
        System.out.println("比赛结束, 该队伍总用时" + time + "s");
    }
}