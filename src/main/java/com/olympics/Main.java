package com.olympics;

public class Main {
    private static int index = 1;
    public static String test(String name){
        return index++ + ". " + name;
    }
    public static void main(String[] args) {
        System.out.println("动物运动会测试");

        System.out.println(test("多例模式"));
        
        System.out.println(test("外观模式"));
        
        System.out.println(test("享元模式"));
        
        System.out.println(test("备忘录模式"));
        
        System.out.println(test("模板模式"));
        
        System.out.println(test("单例模式"));
        
        System.out.println(test("观察者模式"));
        
        System.out.println(test("桥接模式"));
    }
}
