package com.olympics.flyweight;

import java.util.Hashtable;

//棋子工厂
public class ChessFactory {

    // 类私有化
    private static ChessFactory chessmanFactory = new ChessFactory();

    // 创建享元池
    private final Hashtable<Character, AbstractChess> cache = new Hashtable<>();

    private ChessFactory() {
    }

    public static ChessFactory getInstance() {
        return chessmanFactory;
    }

    /**
     * 获得棋子
     *
     * @param c B-黑棋 W-白棋）
     * @return some object
     */
    public AbstractChess getChessObject(char c) {
        // 从缓存中获得棋子对象实例
        AbstractChess abstractChess = this.cache.get(c);
        if (abstractChess == null) {
            // 没有棋子对象实例信息则创建并放入缓存
            switch (c) {
                case 'B':
                    abstractChess = new BlackChess();
                    break;
                case 'W':
                    abstractChess = new WhiteChess();
                    break;
                default:
                    break;
            }
            // 防止非法字符输入
            if (abstractChess != null) {
                // 放入缓存
                this.cache.put(c, abstractChess);
            }
        }
        // 返回对象
        return abstractChess;
    }
}