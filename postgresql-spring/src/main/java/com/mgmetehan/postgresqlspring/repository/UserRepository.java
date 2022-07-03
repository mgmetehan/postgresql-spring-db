package com.mgmetehan.postgresqlspring.repository;

import com.mgmetehan.postgresqlspring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
