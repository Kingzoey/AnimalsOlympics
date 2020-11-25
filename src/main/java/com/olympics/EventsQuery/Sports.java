package com.olympics.EventsQuery;

public class Sports {
    private String name;
    int num;
    String place;
    String date;
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(String name){
        return this.name;
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
        running.place = "操场";

        Sports swimming = new Sports();
        swimming.date = "2020.08.19";
        swimming.place = "泳池";

        Sports basketball = new Sports();
        basketball.date = "2020.08.18";
        basketball.place = "篮球场";

        Sports football = new Sports();
        football.date = "2020.08.17";
        football.place = "足球场";

        Sports fencing = new Sports();
        fencing.date = "2020.08.14";
        fencing.place = "击剑馆";

        Sports badminton = new Sports();
        badminton.date = "2020.11.11";
        badminton.place = "羽毛球馆";
        
        Sports hurdle = new Sports();
        hurdle.date = "2020.12.02";
        hurdle.place = "操场";
        
        

        running.showPlaceof("跑步");
        swimming.showDateof("游泳");
        swimming.showDateof("游泳");
        hurdle.showDateof(" 跨栏");
        System.out.println(swimming.num);
        System.out.println(running.num);
        System.out.println(hurdle.num);

    }
}



