package com.olympics.visitor;

import java.util.Calendar;

/**
 * 运动会供应品
 */
public class Supply {
    protected String name;
    protected Calendar productionDate;

    Supply(String name, Calendar productionDate) {
        this.name = name;
        this.productionDate = productionDate;
    }

    protected String getName() {
        return name;
    }

    protected Calendar getProductionDate() {
        return productionDate;
    }
}
