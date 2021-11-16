package com.cit.bank.service;

import com.cit.bank.domain.Account;
import com.cit.bank.repository.AccountRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountServiceTest {

    private static AccountService accountService;

    private static AccountRepository accountRepository;

    @BeforeAll
    static void setUp() {
        accountService = new AccountService();
        accountRepository = AccountRepository.getInstance();
    }

    @Test
    void deveTransferirComSucesso() {
        accountService.transfer(1 , 2, new BigDecimal("50"));

        final Account account = accountRepository.findById(1);
        assertEquals(new BigDecimal(50), account.getValue());

        final Account account2 = accountRepository.findById(2);
        assertEquals(new BigDecimal(150), account2.getValue());
    }
}
