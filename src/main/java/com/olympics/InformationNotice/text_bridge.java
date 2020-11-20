package com.olympics.InformationNotice;

import org.w3c.dom.ls.LSOutput;

public class text_bridge {
    public static void main(String[] args) {
        InformCenter FC = InformCenter.getInformCenter();
        
        
        athlete dog_runner = new runner(new dog());
        dog_runner.setName("大黄");
        FC.addFan(dog_runner);
      //  System.out.println(dog_runner instanceof athlete);
        dog_runner.competition();
        
        
        FC.Tnotify("开始比赛");
        FC.saytext();
    }
     
}
