package com.mgmetehan.postgresqlspring.controller;

import com.mgmetehan.postgresqlspring.dto.dtoSystemParameters.SystemParametersCreateDto;
import com.mgmetehan.postgresqlspring.dto.dtoSystemParameters.SystemParametersViewDto;
import com.mgmetehan.postgresqlspring.service.SystemParametersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/systemParameters")
public class SystemParametersController {
    private SystemParametersService systemParametersService;

    public SystemParametersController(SystemParametersService systemParametersService) {
        this.systemParametersService = systemParametersService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<SystemParametersViewDto> getSystemParametersId(@PathVariable("id") Long id) {
        SystemParametersViewDto parametersViewDto = systemParametersService.getSystemParametersId(id);
        return ResponseEntity.ok(parametersViewDto);
    }

    @PostMapping
    public ResponseEntity<?> createSystemParameters(@Valid @RequestBody SystemParametersCreateDto newSystemParameters) {
        return new ResponseEntity<>(systemParametersService.createSystemParameters(newSystemParameters), HttpStatus.CREATED);
    }
}
