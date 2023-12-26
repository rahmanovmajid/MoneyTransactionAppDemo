package com.company.bankingapp.model.dto;

import com.company.bankingapp.model.enums.AccountStatus;
import com.company.bankingapp.model.enums.CurrencyType;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

public record Account(
        Long id,
        String number,
        BigDecimal balance,
        AccountStatus status,
        CurrencyType currencyType,
        Long customerId,
        Set<Transaction> transactions,
        String createdBy,
        @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime createdDate,
        String lastModifiedBy,
        @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime lastModifiedDate) {
}
