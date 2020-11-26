package com.olympics.Mediator;

public class Members {
    protected String name;
    protected Mediator mediator;
 
    public Members(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}