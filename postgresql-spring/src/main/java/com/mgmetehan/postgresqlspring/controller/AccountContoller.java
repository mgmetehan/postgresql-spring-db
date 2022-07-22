package com.mgmetehan.postgresqlspring.controller;

import com.mgmetehan.postgresqlspring.model.Account;
import com.mgmetehan.postgresqlspring.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/account")
public class AccountContoller {
    private AccountService accountService;

    public AccountContoller(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable("id") Long id) {
        Account account = accountService.getAccountById(id);
        return ResponseEntity.ok(account);
    }


    @PostMapping
    public ResponseEntity<?> createAccount(@Valid @RequestBody Account newAccount) {
        return new ResponseEntity<>(accountService.createAccount(newAccount), HttpStatus.CREATED);
    }

}
