package com.olympics.businessdelegate;

// 模拟运动员服务中心

public class BusinessQuery {
    // 热饮服务

    public static final String TEA = "TEA";

    // 用餐服务

    public static final String FOOD = "FOOD";

    // 娱乐服务

    public static final String GAME = "GAME";

    // 住房服务

    public static final String ROOM = "ROOM";

    /**
     * 通过注册中心查询服务
     *
     * @param serverName some argument
     * @return com.dao.pattern.business.interfaces.BusinessService
     */
    public static BusinessService getBusinessService(String serverName) {
        if (TEA.equalsIgnoreCase(serverName)) {
            return new TeaService();
        } else if (FOOD.equalsIgnoreCase(serverName)) {
            return new FoodService();
        } else if (GAME.equalsIgnoreCase(serverName)) {
            return new GameService();
        } else if (ROOM.equalsIgnoreCase(serverName)) {
            return new RoomService();
        }
        return new NULLService();
    }

}



