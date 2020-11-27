package com.olympics.abstractfactory;

import java.util.Scanner;

public class AbstractFactoryTest {
    public static void main(String[] args) {

        Provider provider_lion = new LionFactory();
        Provider provider_tiger = new TigerFactory();
        MemberProductAbstract pro_lion = provider_lion.produce();
        MemberProductAbstract pro_tiger = provider_tiger.produce();
        pro_lion.product();
        pro_tiger.product();
        Provider provider_elephant = new ElephantFactory();

        System.out.println("Do you want to add a new role: elephant? Y/N");
        Scanner read = new Scanner(System.in);
        String confirm = read.next();
        if (confirm.equals("Y")) {
            MemberProductAbstract pro_elephant = provider_elephant.produce();
            pro_elephant.product();
        }
    }
}
