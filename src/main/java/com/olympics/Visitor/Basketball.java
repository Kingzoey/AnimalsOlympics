package com.olympics.Visitor;

public class Basketball implements Element {

    private String brandName;
    private int count;

    public Basketball(String brandName, int count) {
        this.brandName = brandName;
        this.count = count;
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
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}