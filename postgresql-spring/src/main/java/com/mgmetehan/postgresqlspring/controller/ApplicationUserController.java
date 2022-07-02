package com.mgmetehan.postgresqlspring.controller;


import com.mgmetehan.postgresqlspring.dto.dtoApplicationUser.ApplicationUserCreateDto;
import com.mgmetehan.postgresqlspring.dto.dtoApplicationUser.ApplicationUserViewDto;
import com.mgmetehan.postgresqlspring.service.ApplicationUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/applicationUser")
public class ApplicationUserController {

    private ApplicationUserService applicationUserService;

    public ApplicationUserController(ApplicationUserService applicationUserService) {
        this.applicationUserService = applicationUserService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApplicationUserViewDto> getApplicationUserById(@PathVariable("id") Long id){
        ApplicationUserViewDto applicationUserViewDto = applicationUserService.getApplicationUserById(id);
        return ResponseEntity.ok(applicationUserViewDto);
    }


    @PostMapping
    public ResponseEntity<?> createApplicationUser(@Valid @RequestBody ApplicationUserCreateDto newApplicationUser) {
        return new ResponseEntity<>(applicationUserService.createApplicationUser(newApplicationUser), HttpStatus.CREATED);
    }
}
