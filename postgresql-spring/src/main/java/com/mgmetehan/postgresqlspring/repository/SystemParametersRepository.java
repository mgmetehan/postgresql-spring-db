package com.mgmetehan.postgresqlspring.repository;

import com.mgmetehan.postgresqlspring.model.SystemParameters;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemParametersRepository extends JpaRepository<SystemParameters, Long> {
}
