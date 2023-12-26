package com.company.bankingapp.model.request;

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
public class TransferRequest {
    @NotNull
    @NotBlank
    @NotEmpty
    private String fromAccountNumber;
    @NotNull
    @NotBlank
    @NotEmpty
    private String toAccountNumber;
    @NotNull
    private BigDecimal amount;
}
