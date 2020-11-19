package flyweightPattern;

//白色棋子
public class WhiteChessman extends AbstractChessman {
    /**
     * 构造方法 初始化白棋子
     */
    public WhiteChessman() {
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