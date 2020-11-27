package com.olympics.businessdelegate;

// 空服务

public class NULLService implements BusinessService {

    // 处理服务

    @Override
    public void dosomething() {
        System.out.println("当前请求服务不存在！");
    }
}


