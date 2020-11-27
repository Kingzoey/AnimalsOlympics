package com.olympics.specification;

public interface ISpecification {
    // 是否满足条件
    boolean isSatisfiedBy(Sport candidate);

    ISpecification and(ISpecification spec);

    ISpecification or(ISpecification spec);

} 