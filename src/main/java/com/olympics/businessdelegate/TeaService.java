package com.olympics.businessdelegate;

// 热饮服务

public class TeaService implements BusinessService {

    // 处理服务

    @Override
    public void dosomething() {
        System.out.println("提供热饮☕服务");
    }
}



