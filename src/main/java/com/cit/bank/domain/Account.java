package com.cit.bank.domain;

import java.math.BigDecimal;
import java.util.UUID;

public class Account {

    private final UUID uuid;
    private BigDecimal value;
    private final Customer customer;

    public Account(Customer customer) {
        this.uuid = UUID.randomUUID();
        this.value = BigDecimal.ZERO;
        this.customer = customer;
    }
}
