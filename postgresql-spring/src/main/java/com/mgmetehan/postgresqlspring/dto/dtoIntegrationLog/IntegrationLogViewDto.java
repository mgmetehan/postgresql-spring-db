package com.mgmetehan.postgresqlspring.dto.dtoIntegrationLog;

import com.mgmetehan.postgresqlspring.model.IntegrationLog;
import lombok.Data;

import javax.persistence.Enumerated;

@Data
public class IntegrationLogViewDto {
    private Long id;

/*    @Enumerated
    private Process process;

    @Enumerated
    private Service service;

    @Enumerated
    private Status Status;*/

    private String request;

    private String response;

    private String description;

    private String duration;

    private String url;

 /*   enum Process {
        LOGIN, ACCOUNT_CREATE
    }

    enum Service {
        DSS_CRM, SARDIS
    }

    enum Status {
        SUCCESS, ERROR, MOCK
    }*/

    public IntegrationLogViewDto(Long id, String request, String response, String description, String duration, String url) {
        this.id = id;
        this.request = request;
        this.response = response;
        this.description = description;
        this.duration = duration;
        this.url = url;
    }

    public static IntegrationLogViewDto of(IntegrationLog integrationLog) {
        return new IntegrationLogViewDto(integrationLog.getId(), integrationLog.getRequest(), integrationLog.getResponse(), integrationLog.getDescription(), integrationLog.getDuration(), integrationLog.getUrl());
    }
}
