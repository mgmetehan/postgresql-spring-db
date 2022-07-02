package com.mgmetehan.postgresqlspring.controller;

import com.mgmetehan.postgresqlspring.dto.dtoKafkaEventLog.KafkaEventLogCreateDto;
import com.mgmetehan.postgresqlspring.dto.dtoKafkaEventLog.KafkaEventLogViewDto;
import com.mgmetehan.postgresqlspring.service.KafkaEventLogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/kafkaEventLog")
public class KafkaEventLogController {

    private KafkaEventLogService kafkaEventLogService;

    public KafkaEventLogController(KafkaEventLogService kafkaEventLogService) {
        this.kafkaEventLogService = kafkaEventLogService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<KafkaEventLogViewDto> getKafkaEventLogById(@PathVariable("id") Long id) {
        KafkaEventLogViewDto kafkaEventLogViewDto = kafkaEventLogService.getKafkaEventLogById(id);
        return ResponseEntity.ok(kafkaEventLogViewDto);
    }

    @PostMapping
    public ResponseEntity<?> createKafkaEventLog(@Valid @RequestBody KafkaEventLogCreateDto newKafkaEventLog){
        return new ResponseEntity<>(kafkaEventLogService.createKafkaEventLog(newKafkaEventLog), HttpStatus.CREATED);
    }

}
