package com.mgmetehan.postgresqlspring.repository;

import com.mgmetehan.postgresqlspring.model.IntegrationLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntegrationLogRepository extends JpaRepository<IntegrationLog, Long> {
}