package com.olympics.businessdelegate;

// 用餐服务

public class FoodService implements BusinessService {

    // 处理服务

    @Override
    public void dosomething() {
        System.out.println("提供用餐🍔服务");
    }
}



