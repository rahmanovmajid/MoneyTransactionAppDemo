package com.company.bankingapp.model.dto;

import com.company.bankingapp.model.enums.RoleType;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record Role(
        Long id,
        RoleType roleType,
        String createdBy,
        @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime createdDate,
        String lastModifiedBy,
        @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime lastModifiedDate) {
}
