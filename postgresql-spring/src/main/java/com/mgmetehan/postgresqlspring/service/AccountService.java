package com.mgmetehan.postgresqlspring.service;

import com.mgmetehan.postgresqlspring.model.Account;

public interface AccountService {
    Account getAccountById(Long id);

    Account createAccount(Account newAccount);
}
