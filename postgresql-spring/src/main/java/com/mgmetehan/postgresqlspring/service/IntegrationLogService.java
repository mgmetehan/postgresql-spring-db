package com.mgmetehan.postgresqlspring.service;

import com.mgmetehan.postgresqlspring.model.IntegrationLog;

public interface IntegrationLogService {
    IntegrationLog getIntegrationLogById(Long id);

    IntegrationLog createIntegrationLog(IntegrationLog newIntegrationLog);
}
