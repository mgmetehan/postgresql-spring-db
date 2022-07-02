package com.mgmetehan.postgresqlspring.controller;

import com.mgmetehan.postgresqlspring.dto.dtoBaseEntity.BaseEntityCreateDto;
import com.mgmetehan.postgresqlspring.dto.dtoBaseEntity.BaseEntityViewDto;
import com.mgmetehan.postgresqlspring.service.BaseEntityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/baseEntity")
public class BaseEntityController {

    private BaseEntityService baseEntityService;

    public BaseEntityController(BaseEntityService baseEntityService) {
        this.baseEntityService = baseEntityService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<BaseEntityViewDto> getBaseEntityById(@PathVariable("id") Long id){
        BaseEntityViewDto baseEntityViewDto = baseEntityService.getBaseEntityById(id);
        return ResponseEntity.ok(baseEntityViewDto);
    }


    @PostMapping
    public ResponseEntity<?> createBaseEntity(@Valid @RequestBody BaseEntityCreateDto newBaseEntity) {
        return new ResponseEntity<>(baseEntityService.createBaseEntity(newBaseEntity), HttpStatus.CREATED);
    }

}
