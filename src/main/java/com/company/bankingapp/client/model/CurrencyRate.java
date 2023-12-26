package com.company.bankingapp.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

public record CurrencyRate(
        Date date,
        String historical,
        Info info,
        Query query,
        BigDecimal result,
        Boolean success
) {
}
