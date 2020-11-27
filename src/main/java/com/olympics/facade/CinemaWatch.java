package com.olympics.facade;

//影院
public class CinemaWatch implements Cinema {
    @Override
    public void Watching() {
        System.out.println(this.getClass() + " : " + "看电影" + " - " + "影院观影中");
    }
}
