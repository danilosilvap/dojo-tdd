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

    public void toDeposit(BigDecimal receivedValue) {
        this.value.add(receivedValue);
    }

    public void toWithdraw(BigDecimal withdrawValue) {
        this.value.subtract(withdrawValue);
    }

    public Integer getIdentifier() {
        return identifier;
    }
}
