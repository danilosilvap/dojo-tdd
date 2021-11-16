package com.cit.bank.service;

import com.cit.bank.domain.Account;
import com.cit.bank.repository.AccountRepository;

import java.math.BigDecimal;

public class AccountService {

    private AccountRepository accountRepository = AccountRepository.getInstance();

    public void transfer(final Integer originAccountId, final Integer destinationAccountId, final BigDecimal value) {
        final Account originAccount = accountRepository.findById(originAccountId);
        final Account destinationAccount = accountRepository.findById(destinationAccountId);

        originAccount.toWithdraw(value);
        destinationAccount.toDeposit(value);
    }

    public void deposit(final Integer accountId, final BigDecimal value) {

    }

    public void withdraw(final Integer accountId, final BigDecimal value) {

    }
}
