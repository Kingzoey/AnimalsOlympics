package com.olympics.EventsQuery;

public interface ISpecification {
    // 是否满足条件
    public boolean isSatisfiedBy(Object candidate);

    public ISpecification and(ISpecification spec);

    public ISpecification or(ISpecification spec);

} 