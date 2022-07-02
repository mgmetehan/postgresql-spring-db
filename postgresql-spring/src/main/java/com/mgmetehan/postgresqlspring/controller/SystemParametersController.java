package com.mgmetehan.postgresqlspring.controller;


import com.mgmetehan.postgresqlspring.dto.dtoSystemParameters.SystemParametersViewDto;
import com.mgmetehan.postgresqlspring.service.SystemParametersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/systemParameters")
public class SystemParametersController {
    private SystemParametersService systemParametersService;

    public SystemParametersController(SystemParametersService systemParametersService) {
        this.systemParametersService = systemParametersService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<SystemParametersViewDto> getSystemParametersId(@PathVariable("id") Long id){
        SystemParametersViewDto parametersViewDto=systemParametersService.getSystemParametersId(id);
        return ResponseEntity.ok(parametersViewDto);
    }


}
