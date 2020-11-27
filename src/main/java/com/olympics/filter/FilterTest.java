package com.olympics.filter;

import java.util.LinkedList;
import java.util.List;

public class FilterTest {
    public static void main(String[] args) {
        List<Sporter> sporters = new LinkedList<>();


        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                sporters.add(new Sporter(String.valueOf(i), "男"));
            } else {
                sporters.add(new Sporter(String.valueOf(i), "女"));
            }
        }


        Filter boyFilter = new BoyFilter();
        //筛选出男同胞们
        sporters = boyFilter.filter(sporters);
        sporters.forEach(Sporter -> System.out.println(Sporter.toString()));


    }


}