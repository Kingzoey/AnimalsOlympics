package com.olympics.eventsQuery;

public abstract class CompositeSpecification implements ISpecification{
    public abstract boolean isSatisfiedBy(Object candidate);
    public ISpecification and(ISpecification spec){ 
        return new AndSpecification(this,spec);
    }
    public ISpecification or(ISpecification spec){
        return new AndSpecification(this,spec);
    }
}