package com.mgmetehan.postgresqlspring.service.serviceImpl;

import com.mgmetehan.postgresqlspring.exception.NotFoundException;
import com.mgmetehan.postgresqlspring.model.IntegrationLog;
import com.mgmetehan.postgresqlspring.repository.IntegrationLogRepository;
import com.mgmetehan.postgresqlspring.service.IntegrationLogService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IntegrationLogServiceImpl implements IntegrationLogService {
    private final IntegrationLogRepository integrationLogRepository;

    public IntegrationLogServiceImpl(IntegrationLogRepository integrationLogRepository) {
        this.integrationLogRepository = integrationLogRepository;
    }


    @Override
    public IntegrationLog getIntegrationLogById(Long id) {
        Optional<IntegrationLog> optionalIntegrationLog = integrationLogRepository.findById(id);
        IntegrationLog integrationLog = optionalIntegrationLog.orElseThrow(() -> new NotFoundException("Not Found Exception"));
        return integrationLog;
    }

    @Override
    public IntegrationLog createIntegrationLog(IntegrationLog newIntegrationLog) {
        IntegrationLog saveIntegrationLog = new IntegrationLog();
        saveIntegrationLog.setProcess(newIntegrationLog.getProcess());
        saveIntegrationLog.setService(newIntegrationLog.getService());
        saveIntegrationLog.setStatus(newIntegrationLog.getStatus());
        saveIntegrationLog.setRequest(newIntegrationLog.getRequest());
        saveIntegrationLog.setResponse(newIntegrationLog.getResponse());
        saveIntegrationLog.setDescription(newIntegrationLog.getDescription());
        saveIntegrationLog.setDuration(newIntegrationLog.getDuration());
        saveIntegrationLog.setUrl(newIntegrationLog.getUrl());

        IntegrationLog integrationLog = integrationLogRepository.save(saveIntegrationLog);
        return integrationLog;
    }
}
