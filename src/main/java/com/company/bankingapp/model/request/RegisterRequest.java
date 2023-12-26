package com.company.bankingapp.model.request;

import com.company.bankingapp.model.enums.RoleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    @NotNull @NotBlank @NotEmpty
    private String username;
    @NotNull @NotBlank @NotEmpty
    private String password;
    @NotNull @NotBlank @NotEmpty
    private String firstName;
    @NotNull @NotBlank @NotEmpty
    private String lastName;
    @NotNull
    private RoleType roleType;
}
