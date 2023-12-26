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
@AllArgsConstructor
@NoArgsConstructor
public class CreateAccountRequest {
    @NotNull
    private Long customerId;
    @NotNull @NotBlank @NotEmpty
    private String number;
    @NotNull
    private BigDecimal balance;
    @NotNull
    private CurrencyType currencyType;
}
