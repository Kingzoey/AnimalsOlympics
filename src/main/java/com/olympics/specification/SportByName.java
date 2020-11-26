package com.olympics.specification;

public class SportByName extends CompositeSpecification {
    private final String name;

    public SportByName(String name) {
        this.name = name;
    }

    @Override
    public boolean isSatisfiedBy(Sport candidate) {
        return candidate.getName().contains(name);
    }
}
