package com.olympics.visitor;

import java.util.Calendar;
import java.util.Date;

/**
 * 运动会供应品
 */
public class Supply {
    protected String name;
    protected Date productionDate;

    Supply(String name, Calendar productionDate) {
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
