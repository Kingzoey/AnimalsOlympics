package com.olympics.factory;

import java.util.Scanner;

public class FactoryTest {
    public static void main(String[] args) {
        label:
        while (true) {
            System.out.println("Please choose which kind of animal to create,lion or tiger.If you want to break, input break!");
            Scanner read = new Scanner(System.in);
            String confirm = read.next();
            ProductFactory fac = new ProductFactory();
            switch (confirm) {
                case "lion": {
                    MemberProduct produce = fac.produce("lion");
                    produce.product();
                    break;
                }
                case "tiger": {
                    MemberProduct produce = fac.produce("tiger");
                    produce.product();
                    break;
                }
                case "break":
                    break label;
                default:
                    System.out.println("Please input tiger or lion or break!");
                    break;
            }
        }
    }
}
