package com.company.bankingapp.model.request;

import com.company.bankingapp.model.enums.RoleType;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRoleRequest {
    @NotNull
    private RoleType roleType;
}
