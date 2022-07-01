package com.mgmetehan.postgresqlspring.service;

import com.mgmetehan.postgresqlspring.dto.dtoIntegrationLog.IntegrationLogCreateDto;
import com.mgmetehan.postgresqlspring.dto.dtoIntegrationLog.IntegrationLogViewDto;
import com.mgmetehan.postgresqlspring.model.IntegrationLog;

public interface IntegrationLogService {
    IntegrationLogViewDto createIntegrationLog(IntegrationLogCreateDto newIntegrationLog);
}
