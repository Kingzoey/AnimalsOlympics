package com.olympics.eventsQuery;

interface ISpecification {
    // 是否满足条件
    boolean isSatisfiedBy(Object candidate);
    public ISpecification and(ISpecification spec);
    public ISpecification or(ISpecification spec);
    public ISpecification not();
}