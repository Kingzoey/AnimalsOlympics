package com.olympics.Flyweight;

import java.util.Hashtable;

//棋子工厂
public class ChessFactory {
    // 单例模式工厂
    private static ChessFactory chessmanFactory = new ChessFactory();
    // 缓存存放共享对象
    private final Hashtable<Character, AbstractChess> cache = new Hashtable<>();

    // 私有化构造方法
    private ChessFactory() {
    }

    // 获得单例工厂
    public static ChessFactory getInstance() {
        return chessmanFactory;
    }

    /**
     * 根据字符获得棋子
     *
     * @param c （B：黑棋 W：白棋）
     * @return
     */
    public AbstractChess getChessObject(char c) {
        // 从缓存中获得棋子对象实例
        AbstractChess abstractChess = this.cache.get(c);
        if (abstractChess == null) {
            // 缓存中没有棋子对象实例信息，则创建棋子对象实例并放入缓存
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
            // 返回null以防止非法字符的进入
            if (abstractChess != null) {
                // 放入缓存
                this.cache.put(c, abstractChess);
            }
        }
        // 如果缓存中存在棋子对象则直接返回
        return abstractChess;
    }
}