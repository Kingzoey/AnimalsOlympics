package com.olympics.InformationNotice;

import org.w3c.dom.ls.LSOutput;

public class InformNote extends InformNotesTemplate{
    public static void main(String[] args) {
 
         InformNote m1 = new InformNote();
         m1.play();
    }

   

    @Override
    void startInform() {
        System.out.println("模板模式开始");
        //创建发布中心
        InformCenter FC = InformCenter.getInformCenter();
        //创建动物运动员
        athlete dog_runner = new runner(new dog());
        dog_runner.setName("大黄");
        FC.addFan(dog_runner);
        dog_runner.competition();
        FC.Tnotify("开始比赛");
        
    }

    @Override
    void endInform() {
        System.out.println("比赛信息发布结束，模板模式结束");
    }
}
