package com.mgmetehan.postgresqlspring.dto.dtoExternalRequestLog;

import com.mgmetehan.postgresqlspring.model.ApplicationUser;
import lombok.Data;

@Data
public class ExternalRequestLogViewDto {
    private Long id;
    private String request;
    private String response;
    private String duration;
    private String resultCode;
    private String path;
    private String httpMethod;
    private ApplicationUser applicationUser;
    private Long transactionId;
}
