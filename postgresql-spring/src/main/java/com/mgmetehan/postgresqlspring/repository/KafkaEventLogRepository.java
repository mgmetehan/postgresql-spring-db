package com.mgmetehan.postgresqlspring.repository;

import com.mgmetehan.postgresqlspring.model.KafkaEventLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KafkaEventLogRepository extends JpaRepository<KafkaEventLog, Long> {
}
