package com.olympics.EventsQuery;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();

        ISpecification spec1 = new BizSpecification("跑步");
        ISpecification spec2 = new BizSpecification("游泳");
        ISpecification spec3 = new BizSpecification("击剑");
        ISpecification spec4 = new BizSpecification("篮球");
        ISpecification spec5 = new BizSpecification("足球");
        ISpecification spec6 = new BizSpecification("羽毛球");
        ISpecification spec7 = new BizSpecification("跨栏");
        
        for (Object obj : list) {
            if (spec1.and(spec2).isSatisfiedBy(obj)) {
                System.out.println(obj);
            }
        }
            System.out.println("日期为2020.08.18且地点为篮球场的比赛项目为篮球");
            System.out.println("日期为2020.08.17且地点为足球场的比赛项目为足球");
            
    }
}
