package com.olympics.InformationNotice;

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
        dog_runner.setName("小狗");
        athlete cat_runner = new runner(new cat());
        cat_runner.setName("小猫");
        athlete bear_runner = new runner(new bear());
        bear_runner.setName("小熊");
        //桥接
        dog_runner.competition();
        cat_runner.competition();
        bear_runner.competition();
        //观察者模式
        FC.addAthlete(dog_runner);
        FC.addAthlete(cat_runner);
        FC.addAthlete(bear_runner);
        FC.toNotify("比赛开始时间");
        
    }

    @Override
    void endInform() {
        System.out.println("比赛信息发布结束，模板模式结束");
    }
}
