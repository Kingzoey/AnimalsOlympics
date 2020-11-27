package com.olympics.flyweight;

/*享元模式*/

// 测试类
public class ChessmanTest {
    public static void main(String[] args) {
        AbstractChess a1, a2, b1, b2;
        System.out.println("棋类建造--享元模式模拟--2");
        a1 = new BlackChess();
        a2 = new BlackChess();
        System.out.println("a1 == a2");
        b1 = new WhiteChess();
        b2 = new WhiteChess();
        System.out.println("b1 == b2");
        a1.show();
        b1.show();
        a2.show();
        b2.show();
    }
}