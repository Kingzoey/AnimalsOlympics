package com.olympics.specification;
//此类用于测试根据指定条件查询比赛项目，使用了规格模式，与本包中除Sports类外其余类为同一设计模式

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SpecificationTest {
    public static void main(String[] args) {
        ArrayList<Sport> sports = new ArrayList<>();

        Sport running = new Sport();
        running.setName("跑步");
        running.setDate(new GregorianCalendar(2020, Calendar.SEPTEMBER, 20));
        running.setPlace("操场");
        sports.add(running);

        Sport swimming = new Sport();
        swimming.setName("游泳");
        swimming.setDate(new GregorianCalendar(2020, Calendar.SEPTEMBER, 19));
        swimming.setPlace("泳池");
        sports.add(swimming);

        Sport basketball = new Sport();
        basketball.setName("篮球");
        basketball.setDate(new GregorianCalendar(2020, Calendar.SEPTEMBER, 18));
        basketball.setPlace("篮球场");
        sports.add(basketball);

        Sport football = new Sport();
        football.setName("足球");
        football.setDate(new GregorianCalendar(2020, Calendar.SEPTEMBER, 17));
        football.setPlace("足球场");
        sports.add(football);

        Sport fencing = new Sport();
        fencing.setName("击剑");
        fencing.setDate(new GregorianCalendar(2020, Calendar.SEPTEMBER, 14));
        fencing.setPlace("击剑馆");
        sports.add(fencing);

        Sport badminton = new Sport();
        badminton.setName("羽毛球");
        badminton.setDate(new GregorianCalendar(2020, Calendar.DECEMBER, 11));
        badminton.setPlace("羽毛球馆");
        sports.add(badminton);

        Sport hurdle = new Sport();
        hurdle.setName("跨栏");
        hurdle.setDate(new GregorianCalendar(2020, Calendar.DECEMBER, 2));
        hurdle.setPlace("操场");
        sports.add(hurdle);

        System.out.println("下面开始筛选, 条件: 跑步或球类运动, 地点在球场进行");
        ISpecification spec1 = new SportByName("跑");
        ISpecification spec2 = new SportByName("球");
        ISpecification spec3 = new SportByPlace("球场");

        for (Sport sport : sports) {
            if (spec1.or(spec2).and(spec3).isSatisfiedBy(sport)) {
                System.out.println(sport.getName() + "\t" + sport.getPlace());
            }
        }
    }
}
