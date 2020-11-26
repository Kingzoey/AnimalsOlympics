package com.olympics.specification;

public interface ISpecification {
    // 是否满足条件
    public boolean isSatisfiedBy(Sport candidate);

    public ISpecification and(ISpecification spec);

    public ISpecification or(ISpecification spec);

} 