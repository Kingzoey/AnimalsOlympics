package com.olympics.BusinessDelegate;


// 创建业务代表

public class BusinessDelegate {

    // 业务接口

    private BusinessService businessService;
    // 具体服务名

    private String serverName;


    /**
     * 服务名，标识
     * @param serverName
     * @return
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * 处理业务
     * @return void
     */
    public void dealBusiness(){
        this.businessService=BusinessQuery.getBusinessService(this.serverName);
        this.businessService.dosomething();
    }
}


