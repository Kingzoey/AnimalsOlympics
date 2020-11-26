package com.olympics.eventsquery;
//此类用于测试根据指定条件查询比赛项目，使用了规格模式，与本包中除Sports类外其余类为同一设计模式

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
            System.out.println("日期为 2020.08.18 且地点为 篮球场 的比赛项目为 篮球");
            System.out.println("日期为 2020.08.17 且地点为 足球场 的比赛项目为 足球");
            
    }
}
