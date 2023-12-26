package com.company.bankingapp.model.request;

import com.company.bankingapp.model.enums.CurrencyType;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DebitRequest {
    @NotNull @NotBlank @NotEmpty
    private String accountNumber;
    @NotNull
    private BigDecimal amount;
    @NotNull
    private CurrencyType currencyType;
}
