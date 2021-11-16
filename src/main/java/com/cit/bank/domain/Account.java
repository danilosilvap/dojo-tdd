package com.cit.bank.domain;

import java.math.BigDecimal;

public class Account {

    private final Integer identifier;
    private BigDecimal value;
    private final Customer customer;

    public Account(final Integer identifier, final Customer customer) {
        this.identifier = identifier;
        this.value = BigDecimal.ZERO;
        this.customer = customer;
    }

    public Account(final Integer identifier, final Customer customer, BigDecimal value) {
        this.identifier = identifier;
        this.value = value;
        this.customer = customer;
    }

    public void toDeposit(BigDecimal receivedValue) {

    }

    public void toWithdraw(BigDecimal withdrawValue) {

    }

    public Integer getIdentifier() {
        return identifier;
    }
}
