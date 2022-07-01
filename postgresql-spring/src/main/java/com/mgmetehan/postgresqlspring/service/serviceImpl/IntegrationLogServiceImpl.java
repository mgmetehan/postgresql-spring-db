package com.mgmetehan.postgresqlspring.service.serviceImpl;

import com.mgmetehan.postgresqlspring.dto.dtoIntegrationLog.IntegrationLogViewDto;
import com.mgmetehan.postgresqlspring.model.IntegrationLog;
import com.mgmetehan.postgresqlspring.repository.IntegrationLogRepository;
import com.mgmetehan.postgresqlspring.service.IntegrationLogService;
import com.mgmetehan.postgresqlspring.dto.dtoIntegrationLog.IntegrationLogCreateDto;

public class IntegrationLogServiceImpl implements IntegrationLogService {
    private IntegrationLogRepository integrationLogRepository;

    @Override
    public IntegrationLogViewDto createIntegrationLog(IntegrationLogCreateDto newIntegrationLog) {
        IntegrationLog saveIntegrationLog = new IntegrationLog();
        saveIntegrationLog.setRequest(newIntegrationLog.getRequest());
        saveIntegrationLog.setResponse(newIntegrationLog.getResponse());
        saveIntegrationLog.setDescription(newIntegrationLog.getDescription());
        saveIntegrationLog.setDuration(newIntegrationLog.getDuration());
        saveIntegrationLog.setUrl(newIntegrationLog.getUrl());

        IntegrationLog integrationLog = integrationLogRepository.save(saveIntegrationLog);
        return IntegrationLogViewDto.of(integrationLog);
    }
}
