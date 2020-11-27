package com.olympics.mediator;

//定义具体中介者ConcreteMediator,具体中介者通过协调各成员对象实现协作行为，了解并维护它的各个成员。
public class ConcreteMediator extends Mediator {
    MembersA collA;
    MembersB collB;

    public MembersA getCollA() {
        return collA;
    }

    public void setCollA(MembersA collA) {
        this.collA = collA;
    }

    public MembersB getCollB() {
        return collB;
    }

    public void setCollB(MembersB collB) {
        this.collB = collB;
    }

    @Override
    public void contact(String content, Members coll) {
        if (coll == collA) {
            collB.getMessage(content);
        } else {
            collA.getMessage(content);
        }
    }
}