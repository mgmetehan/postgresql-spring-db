package com.mgmetehan.postgresqlspring.service.serviceImpl;

import com.mgmetehan.postgresqlspring.dto.dtoIntegrationLog.IntegrationLogCreateDto;
import com.mgmetehan.postgresqlspring.dto.dtoIntegrationLog.IntegrationLogViewDto;
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
    public IntegrationLogViewDto getIntegrationLogById(Long id) {
        Optional<IntegrationLog> optionalIntegrationLog = integrationLogRepository.findById(id);
        IntegrationLog integrationLog = optionalIntegrationLog.orElseThrow(() -> new NotFoundException("Not Found Exception"));
        return IntegrationLogViewDto.of(integrationLog);
    }

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
