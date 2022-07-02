package com.mgmetehan.postgresqlspring.dto.dtoIntegrationLog;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class IntegrationLogCreateDto {
    private String request;

    private String response;

    private String description;

    private String duration;

    private String url;

    public IntegrationLogCreateDto(String request, String response, String description, String duration, String url) {
        this.request = request;
        this.response = response;
        this.description = description;
        this.duration = duration;
        this.url = url;
    }
}
