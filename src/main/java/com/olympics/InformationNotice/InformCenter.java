package com.olympics.InformationNotice;
//单例模式创建通知中心
public class InformCenter {
    private InformCenter(){
        
    }
    private static InformCenter informCenter=null;
    
    public static InformCenter getInformCenter(){
        if(informCenter==null){
            informCenter=new InformCenter();
        }
        return informCenter;
    }
    
}
