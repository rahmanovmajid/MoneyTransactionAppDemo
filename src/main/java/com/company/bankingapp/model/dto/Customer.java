package com.company.bankingapp.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.Set;

public record Customer(
        Long id,
        String username,
        String password,
        String firstName,
        String lastName,
        Set<Account> accounts,
        Set<Role> roles,
        String createdBy,
        @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime createdDate,
        String lastModifiedBy,
        @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime lastModifiedDate) {
}
