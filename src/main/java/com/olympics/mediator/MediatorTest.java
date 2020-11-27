package com.olympics.mediator;

public class MediatorTest {

    /**
     * @param args some argument
     */
    // 中介者，MembersA、MembersB
    public static void main(String[] args) {
        // 定义中介者
        ConcreteMediator mediator = new ConcreteMediator();
        // 定义具体成员类
        MembersA MembersA = new MembersA("裁判A", mediator);
        MembersB MembersB = new MembersB("成员B", mediator);
        // 中介者知晓每一个具体的Members类
        mediator.setCollA(MembersA);
        mediator.setCollB(MembersB);
        MembersA.contact("我是裁判A，我要判罚成员B");
        MembersB.contact("我是成员B，我要通知裁判A进行队员更换");
    }

}