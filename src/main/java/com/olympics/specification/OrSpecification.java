package com.olympics.specification;

public class OrSpecification extends CompositeSpecification {
    private final ISpecification left;
    private final ISpecification right;

    public OrSpecification(ISpecification left, ISpecification right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(Sport candidate) {
        return left.isSatisfiedBy(candidate) || right.isSatisfiedBy(candidate);
    }
}