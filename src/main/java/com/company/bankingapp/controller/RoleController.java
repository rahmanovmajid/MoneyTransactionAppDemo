package com.company.bankingapp.controller;

import com.company.bankingapp.model.dto.Role;
import com.company.bankingapp.model.request.CreateRoleRequest;
import com.company.bankingapp.model.response.ApiDataResponse;
import com.company.bankingapp.service.RoleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/roles")
public record RoleController(RoleService roleService) {
    @PostMapping
    public ResponseEntity<ApiDataResponse<Role>> createRole(CreateRoleRequest createRoleRequest) {
        Role role = roleService.createRole(createRoleRequest);
        return new ResponseEntity<>(new ApiDataResponse<>(role), HttpStatus.CREATED);
    }
}
