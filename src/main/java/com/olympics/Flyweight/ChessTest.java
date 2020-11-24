package com.olympics.Flyweight;

import java.util.Random;

//测试类
public class ChessTest {
    public static void main(String[] args) {
        // 创建棋类工厂
        ChessFactory fiveChessFactory = ChessFactory.getInstance();
        Random random = new Random();
        int radom = 0;
        AbstractChess abstractChess = null;
        // 随机获得棋子
        for (int i = 0; i < 10; i++) {
            radom = random.nextInt(2);
            switch (radom) {
                // 获得黑棋
                case 0:
                    abstractChess = fiveChessFactory.getChessObject('B');
                    break;
                // 获得白棋
                case 1:
                    abstractChess = fiveChessFactory.getChessObject('W');
                    break;
            }
            if (abstractChess != null) {
                abstractChess.point(i, random.nextInt(15));
            }
        }
    }
}