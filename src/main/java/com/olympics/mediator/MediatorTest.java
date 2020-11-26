package com.olympics.mediator;

public class MediatorTest {
 
    /**
     * @param args
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
        MembersA.contact("我是裁判A，我要判罚B成员");
        MembersB.contact("我是B成员,我要通知裁判A进行队员更换");
    }
 
}