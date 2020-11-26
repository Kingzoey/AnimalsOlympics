package com.olympics.factory;

import java.util.Scanner;

public class FactoryTest {
    public static void main(String[] args)
    {
        while(true)
        {
            System.out.println("Please choose which kind of animal to create,lion or tiger.If you want to break, input break!");
            Scanner read = new Scanner(System.in);
            String confirm = read.next();
            ProductFactory fac=new ProductFactory();
            if(confirm.equals("lion"))
            {
                MemberProduct produce= fac.produce("lion");
                produce.product();
            }
            else if(confirm.equals("tiger"))
            {
                MemberProduct produce= fac.produce("tiger");
                produce.product();
            }
            else if(confirm.equals("break"))
            {
                break;
            }
            else
            {
                System.out.println("Please input tiger or lion or break!");
            }
        }
    }
}
