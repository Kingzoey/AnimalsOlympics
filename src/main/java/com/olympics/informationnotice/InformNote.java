package com.olympics.informationnotice;

import java.util.Scanner;

public class InformNote extends InformNotesTemplate {
    public static void main(String[] args) {

        InformNote m1 = new InformNote();
        m1.play();
    }


    @Override
    void startInform() {

        //创建发布中心
        InformCenter FC = InformCenter.getInformCenter();
        //创建动物运动员
        System.out.println("是否通过桥接模式创建三个跑步运动员Y/N？");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();


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
        System.out.println("请输入通知这三名运动员的消息");
        Scanner scc = new Scanner(System.in);
        String mess = scc.next();
        FC.toNotify(mess);

    }

}
