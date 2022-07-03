package com.mgmetehan.postgresqlspring.repository;

import com.mgmetehan.postgresqlspring.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
