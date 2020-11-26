package com.olympics.specification;

public abstract class CompositeSpecification implements ISpecification {
    public abstract boolean isSatisfiedBy(Sport candidate);

    public ISpecification and(ISpecification spec) {
        return new AndSpecification(this, spec);
    }

    public ISpecification or(ISpecification spec) {
        return new OrSpecification(this, spec);
    }
}