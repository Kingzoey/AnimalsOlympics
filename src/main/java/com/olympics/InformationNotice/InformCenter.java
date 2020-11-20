package com.olympics.InformationNotice;

import java.util.ArrayList;
import java.util.List;

//单例模式创建通知中心
public class InformCenter implements Inform{
    private InformCenter(){
        
    }
    private static InformCenter informCenter=null;
    //获得通知中心
    public static InformCenter getInformCenter(){
        if(informCenter==null){
            informCenter=new InformCenter();
        }
        return informCenter;
    }

    private List<athlete> fanList = new ArrayList<athlete>();
    
    @Override
    public void addFan(athlete fan){
        fanList.add(fan);
    }
    @Override
    public void deFan(athlete fan){
        fanList.remove(fan);
    }
    @Override
    public void Tnotify(String message){
        for(athlete fan : fanList){
            fan.update(message);
        }
       
    }
    public void saytext(){
        System.out.println("hhh");
    }

}
