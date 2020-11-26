package com.olympics.specification;

public class SportByPlace extends CompositeSpecification {
    private final String place;

    public SportByPlace(String place) {
        this.place = place;
    }

    @Override
    public boolean isSatisfiedBy(Sport candidate) {
        return candidate.getPlace().contains(place);
    }
}
