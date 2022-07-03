package com.mgmetehan.postgresqlspring.repository;

import com.mgmetehan.postgresqlspring.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
