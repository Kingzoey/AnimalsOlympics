package com.olympics.specification;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 此类用于测试根据日期、地点查询比赛项目，使用到数据映射模式、流接口模式和封装字段模式。
 */
public class Sport {
    private String name;
    private int num;
    private String place;
    private Calendar date;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public Calendar getDate() {
        return this.date;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return this.place;
    }

    public void showPlaceOf(String name) {
        this.name = name;
        this.num++;
        System.out.println(this.name + " 项目的地点在 " + this.place);
    }

    public void showDateOf(String name) {
        this.name = name;
        this.num++;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(this.name + " 项目的日期是 " + df.format(this.date.getTime()));
    }

    public static void main(String[] args) {
        Sport running = new Sport();
        running.date = new GregorianCalendar(2020, Calendar.SEPTEMBER, 20);
        running.setPlace("操场");

        Sport swimming = new Sport();
        swimming.date = new GregorianCalendar(2020, Calendar.SEPTEMBER, 19);
        swimming.setPlace("泳池");

        Sport basketball = new Sport();
        basketball.date = new GregorianCalendar(2020, Calendar.SEPTEMBER, 18);
        basketball.setPlace("篮球场");

        Sport football = new Sport();
        football.date = new GregorianCalendar(2020, Calendar.SEPTEMBER, 17);
        football.setPlace("足球场");

        Sport fencing = new Sport();
        fencing.date = new GregorianCalendar(2020, Calendar.SEPTEMBER, 14);
        fencing.setPlace("击剑馆");

        Sport badminton = new Sport();
        badminton.date = new GregorianCalendar(2020, Calendar.DECEMBER, 11);
        badminton.setPlace("羽毛球馆");

        Sport hurdle = new Sport();
        hurdle.date = new GregorianCalendar(2020, Calendar.DECEMBER, 2);
        hurdle.setPlace("操场");

        running.showPlaceOf("跑步");
        swimming.showPlaceOf("游泳");
        swimming.showDateOf("游泳");
        hurdle.showDateOf(" 跨栏");
        System.out.println("游泳项目被查询过" + swimming.num + "次");
        System.out.println("跑步项目被查询过" + running.num + "次");
        System.out.println("跨栏项目被查询过" + hurdle.num + "次");
    }
}



