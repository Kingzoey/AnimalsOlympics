package com.olympics.BusinessDelegate;

import java.util.Random;

// 主程序入口

public class BusinessTest {

    /**
     * 主程序入口
     * @param args
     * @return void
     */
    public static void main(String[] args){
        //创建业务代表
        BusinessDelegate businessDelegate=new BusinessDelegate();
        //创建客户端
        Client client=new Client(businessDelegate);

        Random random = new Random();
        int radom = 0;
        System.out.println("业务代表模式模拟！");
        System.out.println("随机模拟十次服务请求:-)" + "\n");	
        for (int i = 0; i < 10; i++) {
            radom = random.nextInt(5);
            switch (radom) {
                // 通过随机数随机获得服务
                case 0:
                    // 热饮服务名
                    businessDelegate.setServerName(BusinessQuery.TEA);
                    client.dealBusiness();
                    break;
                // 获得白棋
                case 1:
                    // 用餐服务名
                    businessDelegate.setServerName(BusinessQuery.FOOD);
                    client.dealBusiness();
                    break;
                case 2:
                    // 娱乐服务名
                    businessDelegate.setServerName(BusinessQuery.GAME);
                    client.dealBusiness();
                    break;
                case 3:
                    // 住房服务名
                    businessDelegate.setServerName(BusinessQuery.ROOM);
                    client.dealBusiness();
                    break;
                default:
                    businessDelegate.setServerName("NULL");
                    client.dealBusiness();
                    break;
            }
        }
        
        
        // 注入其他服务名
        businessDelegate.setServerName("AAA");
        client.dealBusiness();
    }
}



