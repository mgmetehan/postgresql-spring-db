package com.mgmetehan.postgresqlspring.service;

import com.mgmetehan.postgresqlspring.dto.dtoKafkaEventLog.KafkaEventLogCreateDto;
import com.mgmetehan.postgresqlspring.dto.dtoKafkaEventLog.KafkaEventLogViewDto;
import com.mgmetehan.postgresqlspring.model.KafkaEventLog;

public interface KafkaEventLogService {
    KafkaEventLogViewDto getKafkaEventLogById(Long id);

    KafkaEventLogViewDto createKafkaEventLog(KafkaEventLogCreateDto newKafkaEventLog);
}
