package com.company.bankingapp.model.request;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {
    @NotNull @NotBlank @NotEmpty
    private String username;
    @NotNull @NotBlank @NotEmpty
    private String password;
}
