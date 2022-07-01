package com.mgmetehan.postgresqlspring.dto.dtoIntegrationLog;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Getter
@Setter
public class IntegrationLogCreateDto {
    @Enumerated
    private Process process;

    @Enumerated
    private Service service;

    @Enumerated
    private Status status;

    @NotBlank
    private String request;

    @NotBlank
    private String response;

    @NotBlank
    private String description;

    @NotBlank
    private String duration;

    @NotBlank
    private String url;

    enum Process {
        LOGIN, ACCOUNT_CREATE
    }

    enum Service {
        DSS_CRM, SARDIS
    }

    enum Status {
        SUCCESS, ERROR, MOCK
    }

    public IntegrationLogCreateDto(Process process, Service service, Status status, String request, String response, String description, String duration, String url) {
        this.process = process;
        this.service = service;
        this.status = status;
        this.request = request;
        this.response = response;
        this.description = description;
        this.duration = duration;
        this.url = url;
    }
}
