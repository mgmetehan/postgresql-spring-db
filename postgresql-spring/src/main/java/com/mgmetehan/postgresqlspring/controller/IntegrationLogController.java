package com.mgmetehan.postgresqlspring.controller;

import com.mgmetehan.postgresqlspring.dto.dtoIntegrationLog.IntegrationLogCreateDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mgmetehan.postgresqlspring.service.IntegrationLogService;

import javax.validation.Valid;

@RestController
@RequestMapping("/{integrationLog}")
public class IntegrationLogController {
    private IntegrationLogService integrationLogService;

    public IntegrationLogController(IntegrationLogService integrationLogService) {
        this.integrationLogService = integrationLogService;
    }

    @PostMapping
    public ResponseEntity<?> createIntegrationLog(@Valid @RequestBody IntegrationLogCreateDto newIntegrationLog) {
        return new ResponseEntity<>(integrationLogService.createIntegrationLog(newIntegrationLog), HttpStatus.CREATED);
    }


}
