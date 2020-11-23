package com.olympics.ChainOfResponsibility;

import java.util.*;

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
            sum += r;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("正在进行4x100米接力比赛");
        HandlerChain chain = new HandlerChain();
        System.out.println("第1棒: Rabbit, 速度: 15m/s");
        chain.addHandler(new Rabbit(30));
        System.out.println("第2棒: Turtle, 速度: 3m/s");
        chain.addHandler(new Turtle(3));
        System.out.println("第3棒: Dog, 速度: 10m/s");
        chain.addHandler(new Dog(10));
        System.out.println("第4棒: Dog, 速度: 15m/s");
        chain.addHandler(new Dog(15));
        double time = chain.process(new Segment(100));
        System.out.println("比赛完成, 总用时" + String.valueOf(time) + "s");
    }
}