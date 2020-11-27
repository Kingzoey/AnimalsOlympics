package com.olympics.facade;

import java.util.Random;

/*外观模式*/

// 测试类
public class FacadeTest {
    public static void main(String[] args) {
        RestaurantEat restaurantEat = new RestaurantEat();
        CinemaWatch cinemaWatch = new CinemaWatch();
        ShelvesBuy shelvesBuy = new ShelvesBuy();

        Random random = new Random();

        System.out.println("动物商场--外观模式模拟");
        System.out.println("可供运动员 1-用餐 / 2-观影 / 3-购物");
        System.out.println("随机生成十次请求");
        for (int i = 0; i < 10; i++) {
            int radom = random.nextInt(3);
            switch (radom) {
                // 用餐
                case 0:
                    System.out.println("当前收到请求 — 0 - 用餐");
                    restaurantEat.Eating();
                    break;
                // 观影
                case 1:
                    System.out.println("当前收到请求 — 1 - 观影");
                    cinemaWatch.Watching();
                    break;
                // 购物
                case 2:
                    System.out.println("当前收到请求 - 2 — 购物");
                    shelvesBuy.Buying();
                    break;
            }
        }
    }
}