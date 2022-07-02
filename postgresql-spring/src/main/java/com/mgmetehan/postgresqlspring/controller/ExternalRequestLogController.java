package com.mgmetehan.postgresqlspring.controller;

import com.mgmetehan.postgresqlspring.dto.dtoBaseEntity.BaseEntityCreateDto;
import com.mgmetehan.postgresqlspring.dto.dtoBaseEntity.BaseEntityViewDto;
import com.mgmetehan.postgresqlspring.model.ExternalRequestLog;
import com.mgmetehan.postgresqlspring.service.ExternalRequestLogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/externalRequestLog")
public class ExternalRequestLogController {
    private ExternalRequestLogService externalRequestLogService;

    public ExternalRequestLogController(ExternalRequestLogService externalRequestLogService) {
        this.externalRequestLogService = externalRequestLogService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExternalRequestLog> getExternalRequestLogById(@PathVariable("id") Long id) {
        ExternalRequestLog externalRequestLog = externalRequestLogService.getExternalRequestLogById(id);
        return ResponseEntity.ok(externalRequestLog);
    }

    @PostMapping
    public ResponseEntity<?> createExternalRequestLog(@Valid @RequestBody ExternalRequestLog newExternalRequestLog) {
        return new ResponseEntity<>(externalRequestLogService.createExternalRequestLog(newExternalRequestLog), HttpStatus.CREATED);
    }
}
