package com.mgmetehan.postgresqlspring.controller;

import com.mgmetehan.postgresqlspring.dto.dtoIntegrationLog.IntegrationLogCreateDto;
import com.mgmetehan.postgresqlspring.dto.dtoIntegrationLog.IntegrationLogViewDto;
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
    public ResponseEntity<IntegrationLogViewDto> getIntegrationLogById(@PathVariable("id") Long id) {
        IntegrationLogViewDto integrationLogViewDto = integrationLogService.getIntegrationLogById(id);
        return ResponseEntity.ok(integrationLogViewDto);
    }

    @PostMapping
    public ResponseEntity<?> createIntegrationLog(@Valid @RequestBody IntegrationLogCreateDto newIntegrationLog){
        return new ResponseEntity<>(integrationLogService.createIntegrationLog(newIntegrationLog), HttpStatus.CREATED);
    }

}
