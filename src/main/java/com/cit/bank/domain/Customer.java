package com.cit.bank.domain;

public class Customer {

    private final Integer identifier;
    private final String name;
    private boolean enable;

    public Customer(final Integer identifier, final String name) {
        this.identifier = identifier;
        this.name = name;
        this.enable = true;
    }

    public Integer getIdentifier() {
        return identifier;
    }
}
