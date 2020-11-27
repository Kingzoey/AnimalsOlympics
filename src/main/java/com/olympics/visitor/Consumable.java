package com.olympics.visitor;

import java.util.Calendar;

/**
 * 消耗品类
 */
public class Consumable extends Supply implements Element {

    /**
     * 表示消耗品状态
     */
    public enum Status {GOOD, BAD}

    private Status status = Status.GOOD;
    private float amount = 1;
    private final float price;

    public Consumable(String name, Calendar productionDate, float price) {
        super(name, productionDate);
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }
}