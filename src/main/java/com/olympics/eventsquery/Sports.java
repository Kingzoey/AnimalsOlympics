package com.olympics.eventsquery;
//此类用于测试根据日期、地点查询比赛项目，使用到数据映射模式、流接口模式和封装字段模式。
public class Sports {
    private String name;
    int num;
    private String place;
    private String date;
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(String name){
        return this.name;
    }

    public void setDate(String date){
        this.date = date;
    }

    public String getDate(String date){
        return this.date;
    }

    public void setPlace(String place){
        this.place = place;
    }

    public String getPlace(String place){
        return this.place;
    }

    public void showPlaceof(String name) {
        this.name = name;
        this.num ++;
        System.out.println(this.name + " 项目的地点在 " + this.place);
    }

    public void showDateof(String name) {
        this.name = name;
        this.num ++;
        System.out.println(this.name + " 项目的日期是 " + this.date);
    }

    public static void main(String[] args) {

        Sports running = new Sports();
        running.date = "2020.08.20";
        running.setPlace("操场");

        Sports swimming = new Sports();
        swimming.date = "2020.08.19";
        swimming.setPlace("泳池");

        Sports basketball = new Sports();
        basketball.date = "2020.08.18";
        basketball.setPlace("篮球场");

        Sports football = new Sports();
        football.date = "2020.08.17";
        football.setPlace("足球场");
        
        Sports fencing = new Sports();
        fencing.date = "2020.08.14";
        fencing.setPlace("击剑馆");

        Sports badminton = new Sports();
        badminton.date = "2020.11.11";
        badminton.setPlace("羽毛球馆");
        
        Sports hurdle = new Sports();
        hurdle.date = "2020.12.02";
        hurdle.setPlace("操场");
        
        

        running.showPlaceof("跑步");
        swimming.showDateof("游泳");
        swimming.showDateof("游泳");
        hurdle.showDateof(" 跨栏");
        System.out.println("游泳项目被查询过"+swimming.num+"次");
        System.out.println("跑步项目被查询过"+running.num+"次");
        System.out.println("跨栏项目被查询过"+hurdle.num+"次");

    }
}



