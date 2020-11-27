package com.olympics.iterator;

public class IteratorTest {


    public static void main(String[] args) {
        //创建一个比赛
        Schedule schedule = new Schedule(5);
        //向赛程表中添加比赛
        schedule.appendMatch(new Match("100米跑"));
        schedule.appendMatch(new Match("篮球"));
        schedule.appendMatch(new Match("足球"));
        schedule.appendMatch(new Match("羽毛球"));
        schedule.appendMatch(new Match("跳高"));
        //获得赛程表迭代器
        Iterator iterator = schedule.iterator();
        //迭代
        while (iterator.hasNext()) {
            Match match = (Match) iterator.next();
            System.out.println(match.getName());
        }

    }

}