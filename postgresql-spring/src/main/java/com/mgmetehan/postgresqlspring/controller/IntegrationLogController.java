package com.mgmetehan.postgresqlspring.controller;

import com.mgmetehan.postgresqlspring.model.IntegrationLog;
import com.mgmetehan.postgresqlspring.service.IntegrationLogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/integrationLog")
public class IntegrationLogController {
    private IntegrationLogService integrationLogService;

    public IntegrationLogController(IntegrationLogService integrationLogService) {
        this.integrationLogService = integrationLogService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<IntegrationLog> getIntegrationLogById(@PathVariable("id") Long id) {
        IntegrationLog integrationLog = integrationLogService.getIntegrationLogById(id);
        return ResponseEntity.ok(integrationLog);
    }

    @PostMapping
    public ResponseEntity<?> createIntegrationLog(@Valid @RequestBody IntegrationLog newIntegrationLog){
        return new ResponseEntity<>(integrationLogService.createIntegrationLog(newIntegrationLog), HttpStatus.CREATED);
    }

}
