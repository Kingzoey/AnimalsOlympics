package com.olympics.Visitor;

import java.util.Date;

/**
 * 运动会供应品
 */
public class Supply {
    protected String name;
    protected Date productionDate;
    
    Supply(String name, Date productionDate){
        this.name = name;
        this.productionDate = productionDate;
    }

    protected String getName() {
        return name;
    }

    protected Date getProductionDate() {
        return productionDate;
    }
}
