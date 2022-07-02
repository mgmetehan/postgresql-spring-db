package com.mgmetehan.postgresqlspring.repository;

import com.mgmetehan.postgresqlspring.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser,Long> {

}
