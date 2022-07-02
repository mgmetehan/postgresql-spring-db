package com.mgmetehan.postgresqlspring.repository;

import com.mgmetehan.postgresqlspring.model.ExternalRequestLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExternalRequestLogRepository extends JpaRepository<ExternalRequestLog, Long> {
}
