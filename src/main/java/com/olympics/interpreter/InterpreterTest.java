package com.olympics.interpreter;

import com.olympics.factory.ProductFactory;

import java.util.Scanner;

public class InterpreterTest {
    public static void main(String[] args) {
        label:
        while (true) {
            System.out.println("Please select a team to check if it enters the final among American hawk(1), Japanese dog(2), Chinese dragon(3), Australian kangroo(4).Please input its number.\nIf you want to break, input break!");
            Scanner read = new Scanner(System.in);
            String confirm = read.next();
            ProductFactory fac = new ProductFactory();
            Context Team = new Context();
            switch (confirm) {
                case "1":
                    Team.result("American hawk");
                    break;
                case "2":
                    Team.result("Japanese dog");
                    break;
                case "3":
                    Team.result("Chinese dragon");
                    break;
                case "4":
                    Team.result("Australian kangaroo");
                    break;
                case "break":
                    break label;
                default:
                    System.out.println("Please input 1、2、3、4 or break!");
                    break;
            }
        }


    }
}
