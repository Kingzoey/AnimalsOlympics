package com.basketballScene;
import java.util.Scanner;

public class SystemThread implements Runnable{

    private String flag = "start";
    private String control = "";
    private Boolean isTimeOut = false;
    protected Boolean isTeamMake = false;

    private final Scanner read = new Scanner(System.in);

    protected BasketballPlayer[] players = new BasketballPlayer[12];

    /**
     * 创建球队，输入球员信息——静态工厂模式
     */
    protected void MakeTeam() {

        /*
James 36 23 Forward
Harden 32 13 Guard
Paul 35 3 Guard
Davis 26 6 Forward
Yaoming 39 11 Center
Curry 32 30 Guard
Leonard 29 2 Forward
0
        */
        int i = 0;
        System.out.println("球队组建，球员信息录入：");
        System.out.println("请依次输入球员姓名、年龄、球衣号码、位置（以空号间隔，输入0退出）：");
        System.out.println("三个位置为：Center(中锋),Guard(后卫),Forward(前锋)");
        while (i < 12) {
            String name = read.next();
            if(!name.equals("0")) {
                int age = read.nextInt();
                int number = read.nextInt();
                String position = read.next();
                BasketballPlayer player = PlayerTraining.trainPlayer(name,age,number,position);
                players[i] = player;
                i++;
            } else {
                if (i == 12) {
                    System.out.println("组建球队成功！");
                } else {
                    System.out.println("退出球员组建，👋👋！");
                }
                break;
            }
        }
        showPlayers(players);
    }

    /**
     * 设置首发球员
     */
    protected void SetPlayerStarted() {
        /**
         * 确立首发球员
         */
        int i = 0;
        System.out.println("确立首发球员5人，请输入首发球员的号码:");
        boolean isFind = false;
        for (i = 0; i < 5;) {
            int number = read.nextInt();
            for (BasketballPlayer basketballPlayer : players) {
                if (basketballPlayer != null && basketballPlayer.number == number && !basketballPlayer.isOnCourt) {
                    basketballPlayer.isStarter = true;
                    basketballPlayer.isOnCourt = true;
                    StarterPlayer player = new StarterPlayer(basketballPlayer);
                    player.play();
                    isFind = true;
                    i++;
                    break;
                }
                isFind = false;
            }
            if (!isFind) {
                System.out.println("没有此号码球员或球员已经是首发！");
            }
        }
        showPlayers(players);
    }

    /**
     * 呼叫暂停，更改球员状态——状态模式
     */
    protected void PlayerStateChange() {
        /**
         * 球员状态测试，生成时默认为正常状态——状态模式
         */
        System.out.println("每场比赛，球员的状态会起伏不定");
        System.out.println("便于测试，直观体现，你可以手动改变球员状态：");
        System.out.println("1.失常状态\t2.超常状态\t3.正常状态\t(两两状态之间转化不同) q.退出");
        System.out.println("请输入你要改变状态的球员的号码和状态编号：");
        while(true) {
            String playerNum = read.next();
            if (playerNum.equals("q")) {
                System.out.println("退出状态更改！");
                return;
            }
            BasketballPlayer player = find(players,playerNum);
            String state = read.next();
            if (player == null) {
                System.out.println("没有该球员！请检查输入");
            }
            else {
                switch (state){
                    case "1":
                        player.state.abnormal();
                        break;
                    case "2":
                        player.state.superNormal();
                        break;
                    case "3":
                        player.state.normal();
                        break;
                    default:
                        System.out.println("请检查输入状态选项！");
                        break;
                }
                showPlayers(players);
            }
        }

    }

    /**
     * 呼叫暂停，进入更换球员函数——代理模式
     */
    protected void ChangePlayerOnCourt() {
        /**
         * 球员更换——代理模式
         */
        System.out.println("更换球员测试");
        while (true){
            System.out.println("请输入被替换球员的号码：");
            String choice = read.next();
            if(!isLegal(choice)) {
                System.out.println("请输入合法数字！");
            }else if(Integer.parseInt(choice) == 0)
            {
                System.out.println("退出球员更换！");
                break;
            } else {
                System.out.println("请输入要上场的球员号码：");
                String subNum = read.next();
                BasketballPlayer nowPlayer = find(players,choice);
                BasketballPlayer nextPlayer = find(players,subNum);
                if(nowPlayer != null && nextPlayer != null && nowPlayer.isOnCourt && !nextPlayer.isOnCourt) {
                    SubstitutePlayer subPlayer = new SubstitutePlayer(nowPlayer,nextPlayer);
                    subPlayer.play();
                    showPlayers(players);
                } else {
                    System.out.println("请检查两位球员号码或在场状态！");
                }
            }
        }
        showPlayers(players);
    }

    /**
     * 呼叫暂停，进入战术选择函数——策略模式
     */
    protected void ChangeTactics() {
        /**
         * 战术选择测试——策略模式
         */
        System.out.println("进入战术选择模式：");
        System.out.println("1.进攻战术：普林斯顿    防守战术：半场紧逼 ");
        System.out.println("2.进攻战术：跑   轰    防守战术：3-2联防 ");
        System.out.println("3.进攻战术：单   打    防守战术：包   夹 ");
        System.out.println("0.退出战术选择     ");
        while (true) {
            String choice = read.next();
            if(!isLegal(choice)) {
                System.out.println("请按提示输入数字0-3！");
            } else {
                int choiceToInt = Integer.parseInt(choice);
                if (choiceToInt > 0 && choiceToInt < 4) {
                    CallTactics tactics = new CallTactics(choiceToInt);
                    tactics.executeTactic(players);
                } else if (choiceToInt == 0) {
                    System.out.println("退出战术选择，👋👋！");
                    break;
                } else {
                    System.out.println("请按提示输入数字0-3！");
                }
            }
        }
        showPlayers(players);
    }

    /**
     * 判断用户输入是否合法 主要目的是给出相应提示并维持循环
     * @param s
     * @return 输入有字符则染回false，纯数字返回true
     */
    public boolean isLegal(String s) {
        for(int i = 0;i < s.length();i++) {
            if(!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * @description: 输出球员信息
     * @param players
     */
    public void showPlayers(BasketballPlayer[] players) {
        System.out.println("当前球员信息如下：");
        System.out.println("Name\tage\tNumber\tPosition\tAttack\tDefense\tISONCOURT\tISSTART\t");
        for (int i = 0;i < players.length;i++) {
            if (players[i] != null) {
                System.out.println(players[i].name +"\t"+ players[i].age +"\t"+ players[i].number + "\t\t"+
                        players[i].position +"\t\t"+ players[i].stateAttackAbility +"\t"+ players[i].stateDefenseAbility +"\t"
                        + players[i].isOnCourt +"\t\t"+ players[i].isStarter +"\t");
            }
        }
    }

    /**
     * @description: 根据姓名或号码搜索球员
     * @param players
     * @param search
     * @return BasketballPlayer
     */
    public BasketballPlayer find(BasketballPlayer[] players,String search) {
        if (isLegal(search)) {
            int num = Integer.parseInt(search);
            for (BasketballPlayer player : players
            ) {
                if (player != null && player.number == num) {
                    return player;
                }
            }
        } else {
            for (BasketballPlayer player : players
            ) {
                if (player != null && player.name == search) {
                    return player;
                }
            }
        }
        return null;
    }

    //Mark: 线程的处理方法
    @Override
    /**
     * 线程运行 start后调用run()
     */
    public void run() {
        while(true) {
            if(this.flag.equals("start")) {
                System.out.println("欢迎来到篮球比赛！");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if(flag.equals("suspend") ) {
                try {
                    isTimeOut = true;
                    synchronized (control) {
                        control.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (flag.equals("consume")) {
                isTimeOut = false;
                System.out.println("比赛继续中……");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (flag.equals("end")) {
                return;
            }
        }
    }

    /**
     * 线程暂停
     */
    public void suspend() {
        if (!isTimeOut) {
            flag = "suspend";
        }
    }

    /**
     * 线程继续运行
     */
    public void consume() {
        if (isTimeOut) {
            this.flag = "consume";
            if (flag.equals("consume")) {
                synchronized (control) {
                    control.notifyAll();
                }
            }
        } else {
            System.out.println("比赛已经在进行！");
        }
    }

    /**
     * 线程结束
     */
    public void end() {
        this.flag = "end";
    }
}
