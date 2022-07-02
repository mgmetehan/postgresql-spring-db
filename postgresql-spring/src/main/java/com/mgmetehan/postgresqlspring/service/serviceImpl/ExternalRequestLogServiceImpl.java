package com.mgmetehan.postgresqlspring.service.serviceImpl;

import com.mgmetehan.postgresqlspring.dto.dtoBaseEntity.BaseEntityCreateDto;
import com.mgmetehan.postgresqlspring.dto.dtoBaseEntity.BaseEntityViewDto;
import com.mgmetehan.postgresqlspring.exception.NotFoundException;
import com.mgmetehan.postgresqlspring.model.BaseEntity;
import com.mgmetehan.postgresqlspring.model.ExternalRequestLog;
import com.mgmetehan.postgresqlspring.repository.ExternalRequestLogRepository;
import com.mgmetehan.postgresqlspring.service.ExternalRequestLogService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExternalRequestLogServiceImpl implements ExternalRequestLogService {
    private final ExternalRequestLogRepository externalRequestLogRepository;

    public ExternalRequestLogServiceImpl(ExternalRequestLogRepository externalRequestLogRepository) {
        this.externalRequestLogRepository = externalRequestLogRepository;
    }

    @Override
    public ExternalRequestLog getExternalRequestLogById(Long id) {
        Optional<ExternalRequestLog> optionalExternalRequestLog = externalRequestLogRepository.findById(id);
        ExternalRequestLog externalRequestLog = optionalExternalRequestLog.orElseThrow(() -> new NotFoundException("Not Found Exception"));
        return externalRequestLog;
    }

    @Override
    public ExternalRequestLog createExternalRequestLog(ExternalRequestLog newExternalRequestLog) {
        ExternalRequestLog saveExternalRequestLog = new ExternalRequestLog();

        saveExternalRequestLog.setRequest(newExternalRequestLog.getRequest());
        saveExternalRequestLog.setResponse(newExternalRequestLog.getResponse());
        saveExternalRequestLog.setDuration(newExternalRequestLog.getDuration());
        saveExternalRequestLog.setResultCode(newExternalRequestLog.getResultCode());
        saveExternalRequestLog.setPath(newExternalRequestLog.getPath());
        saveExternalRequestLog.setHttpMethod(newExternalRequestLog.getHttpMethod());
        saveExternalRequestLog.setApplicationUser(newExternalRequestLog.getApplicationUser());
        saveExternalRequestLog.setTransactionId(newExternalRequestLog.getTransactionId());


        ExternalRequestLog externalRequestLog = externalRequestLogRepository.save(saveExternalRequestLog);
        return externalRequestLog;
    }
}

