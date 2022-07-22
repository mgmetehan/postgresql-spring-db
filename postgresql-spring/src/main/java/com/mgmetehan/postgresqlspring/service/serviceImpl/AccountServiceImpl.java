package com.mgmetehan.postgresqlspring.service.serviceImpl;

import com.mgmetehan.postgresqlspring.exception.NotFoundException;
import com.mgmetehan.postgresqlspring.model.Account;
import com.mgmetehan.postgresqlspring.repository.AccountRepository;
import com.mgmetehan.postgresqlspring.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account getAccountById(Long id) {
        Optional<Account> optionalAccount = accountRepository.findById(id);
        Account account = optionalAccount.orElseThrow(() -> new NotFoundException("Not Found Exception"));
        return account;
    }

    @Override
    public Account createAccount(Account newAccount) {
        Account saveAccount = new Account();
        saveAccount.setDssCrmId(newAccount.getDssCrmId());
        saveAccount.setChannel(newAccount.getChannel());
        saveAccount.setType(newAccount.getType());
        saveAccount.setName(newAccount.getName());
        saveAccount.setHostname(newAccount.getHostname());
        saveAccount.setIdType(newAccount.getIdType());
        saveAccount.setIdValue(newAccount.getIdValue());

        Account account = accountRepository.save(saveAccount);
        return account;
    }
}
