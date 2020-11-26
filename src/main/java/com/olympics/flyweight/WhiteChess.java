package com.olympics.flyweight;

//白棋
public class WhiteChess extends AbstractChess {
    // 构造方法 初始化白棋子
    public WhiteChess() {
        super("○");
        System.out.println("白棋创建中 :-)");
    }

    // 点坐标设置
    @Override
    public void point(int x, int y) {
        this.x = x;
        this.y = y;
        // 显示棋子内容
        show();
    }
}