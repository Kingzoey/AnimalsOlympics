package flyweightPattern;

import java.util.Hashtable;

//棋子工厂
public class ChessmanFactory {
    // 单例模式工厂
    private static ChessmanFactory chessmanFactory = new ChessmanFactory();
    // 缓存存放共享对象
    private final Hashtable<Character, AbstractChessman> cache = new Hashtable<>();

    // 私有化构造方法
    private ChessmanFactory() {
    }

    // 获得单例工厂
    public static ChessmanFactory getInstance() {
        return chessmanFactory;
    }

    /**
     * 根据字符获得棋子
     *
     * @param c （B：黑棋 W：白棋）
     * @return
     */
    public AbstractChessman getChessmanObject(char c) {
        // 从缓存中获得棋子对象实例
        AbstractChessman abstractChessman = this.cache.get(c);
        if (abstractChessman == null) {
            // 缓存中没有棋子对象实例信息 则创建棋子对象实例 并放入缓存
            switch (c) {
                case 'B':
                    abstractChessman = new BlackChessman();
                    break;
                case 'W':
                    abstractChessman = new WhiteChessman();
                    break;
                default:
                    break;
            }
            // 为防止 非法字符的进入 返回null
            if (abstractChessman != null) {
                // 放入缓存
                this.cache.put(c, abstractChessman);
            }
        }
        // 如果缓存中存在 棋子对象则直接返回
        return abstractChessman;
    }
}