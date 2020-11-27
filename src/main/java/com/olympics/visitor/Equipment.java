package com.olympics.visitor;

import java.util.Calendar;

/**
 * 运动器材类
 */
public class Equipment extends Supply implements Element {

    private String brandName;
    private boolean inUse = false;
    private boolean isBroken = false;
    private int quality = -1;

    public Equipment(String name, Calendar productionDate, String brandName) {
        super(name, productionDate);
        this.brandName = brandName;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public boolean isInUse() {
        return inUse;
    }

    /**
     * 借用器材
     */
    public void takeItem() {
        this.inUse = true;
    }

    /**
     * 归还器材
     */
    public void returnItem() {
        this.inUse = false;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public void repair() {
        isBroken = false;
    }
}