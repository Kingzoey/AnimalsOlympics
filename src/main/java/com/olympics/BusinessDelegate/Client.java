package com.olympics.BusinessDelegate;
    
// 客户端


public class Client {
    // 业务代表

    private BusinessDelegate businessDelegate;

    /**
     * 构造方法
     * @param businessDelegate
     * @return
     */
    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    /**
     * 处理业务
     * @return void
     */
    public void dealBusiness(){
        this.businessDelegate.dealBusiness();
    }
}



