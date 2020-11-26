package com.olympics.flyweight;

//黑棋
public class BlackChess extends AbstractChess {
    // 初始化黑棋子
    public BlackChess() {
        super("●");
        System.out.println("黑棋创建中 :-)");
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