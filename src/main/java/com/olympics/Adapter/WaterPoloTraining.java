/*
 * @Project : AnimalsOlympics
 * @File    : WaterPoloTraining.java
 * @Author  : 刘文朔(liuwenshuo2000@126.com)
 * @Software: IntelliJ IDEA
 */

package com.olympics.Adapter;

import com.olympics.Decorator.EnhancedGame;
import com.olympics.Decorator.WaterPoloGame;

import java.util.Objects;
import java.util.Scanner;

public class WaterPoloTraining implements Training {
    WaterPoloAdapter wpa;

    public static void main(String[] args) {
        Training t = new WaterPoloTraining();
        t.train();
    }

    @Override
    public void train() {
        System.out.println("1.普通训练 2.有详细分析的训练");
        Scanner sca = new Scanner(System.in);
        String s = sca.nextLine();
        s = s.trim();
        System.out.println("输入训练次数");
        int i = sca.nextInt();
        if (s.equals("1"))
            wpa = new WaterPoloAdapter(new WaterPoloGame(), i);
        else
            wpa = new WaterPoloAdapter(new EnhancedGame(), i);
        wpa.train();
    }
}
