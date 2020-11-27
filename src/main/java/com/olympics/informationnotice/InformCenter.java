package com.olympics.informationnotice;

import java.util.ArrayList;
import java.util.List;

//单例模式创建通知中心
public class InformCenter implements Inform {
    private InformCenter() {
        System.out.println("单例模式:创建唯一一个通知中心");
    }

    private static InformCenter informCenter = null;

    //获得通知中心
    public static InformCenter getInformCenter() {
        if (informCenter == null) {
            informCenter = new InformCenter();
        }
        return informCenter;
    }

    private List<athlete> athleteList = new ArrayList<>();

    @Override
    public void addAthlete(athlete fan) {
        athleteList.add(fan);
    }

    @Override
    public void deAthlete(athlete fan) {
        athleteList.remove(fan);
    }

    @Override
    public void toNotify(String message) {
        for (athlete fan : athleteList) {
            fan.update(message);
        }

    }


}
