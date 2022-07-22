package com.mgmetehan.postgresqlspring.controller;

import com.mgmetehan.postgresqlspring.model.Account;
import com.mgmetehan.postgresqlspring.model.Role;
import com.mgmetehan.postgresqlspring.service.RoleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/role")
public class RoleController {
    private RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Role> getRoleById(@PathVariable("id") Long id) {
        Role role = roleService.getRoleById(id);
        return ResponseEntity.ok(role);
    }


    @PostMapping
    public ResponseEntity<?> createRole(@Valid @RequestBody Role newRole) {
        return new ResponseEntity<>(roleService.createRole(newRole), HttpStatus.CREATED);
    }
}
