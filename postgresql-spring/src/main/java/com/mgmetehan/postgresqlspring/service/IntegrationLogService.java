package com.mgmetehan.postgresqlspring.service;

import com.mgmetehan.postgresqlspring.dto.dtoIntegrationLog.IntegrationLogCreateDto;
import com.mgmetehan.postgresqlspring.dto.dtoIntegrationLog.IntegrationLogViewDto;

public interface IntegrationLogService {
    IntegrationLogViewDto getIntegrationLogById(Long id);

    IntegrationLogViewDto createIntegrationLog(IntegrationLogCreateDto newIntegrationLog);
}
