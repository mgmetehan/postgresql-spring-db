package com.mgmetehan.postgresqlspring.service;

import com.mgmetehan.postgresqlspring.model.ExternalRequestLog;

public interface ExternalRequestLogService {
    ExternalRequestLog getExternalRequestLogById(Long id);

    ExternalRequestLog createExternalRequestLog(ExternalRequestLog newExternalRequestLog);
}
