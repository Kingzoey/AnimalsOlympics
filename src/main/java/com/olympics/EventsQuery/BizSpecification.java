package com.olympics.EventsQuery;

public class BizSpecification extends CompositeSpecification {
    private String obj;

    public BizSpecification(String obj) {
        this.obj = obj;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return true;
    }
}
