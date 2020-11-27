package com.olympics.businessdelegate;

// 客户端


public class Client {
    // 业务代表

    private final BusinessDelegate businessDelegate;

    /**
     * 构造方法
     *
     * @param businessDelegate some argument
     */
    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    /**
     * 处理业务
     */
    public void dealBusiness() {
        this.businessDelegate.dealBusiness();
    }
}



