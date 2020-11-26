package com.olympics.AbstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args)
    {
        Provider provider_lion=new LionFactory();
        Provider provider_tiger=new TigerFactory();
        MemberProductAbstract pro_lion=provider_lion.produce();
        MemberProductAbstract pro_tiger=provider_tiger.produce();
        pro_lion.product();
        pro_tiger.product();
        Provider provider_elephant=new ElephantFactory();
        MemberProductAbstract pro_elephant=provider_elephant.produce();
        pro_elephant.product();
    }
}
