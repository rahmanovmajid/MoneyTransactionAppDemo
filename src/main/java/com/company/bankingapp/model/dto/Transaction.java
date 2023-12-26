package com.company.bankingapp.model.dto;

import com.company.bankingapp.model.enums.TransactionType;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record Transaction(
        Long id,
        BigDecimal amount,
        Long accountId,
        TransactionType transactionType,
        String createdBy,
        @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime createdDate,
        String lastModifiedBy,
        @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime lastModifiedDate) {
}
