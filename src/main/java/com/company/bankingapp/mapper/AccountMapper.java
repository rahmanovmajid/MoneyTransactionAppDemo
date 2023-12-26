package com.company.bankingapp.mapper;

import com.company.bankingapp.model.dto.Account;
import com.company.bankingapp.model.entity.AccountEntity;
import com.company.bankingapp.model.entity.CustomerEntity;
import com.company.bankingapp.model.enums.AccountStatus;
import com.company.bankingapp.model.request.CreateAccountRequest;
import com.company.bankingapp.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public record AccountMapper(
        TransactionMapper transactionMapper) {

    public Account toAccount(AccountEntity from) {
        return new Account(
                from.getId(),
                from.getNumber(),
                from.getBalance(),
                from.getStatus(),
                from.getCurrencyType(),
                from.getCustomerEntity().getId(),
                transactionMapper.toTransactionSet(from.getTransactionEntities()),
                from.getCreatedBy(),
                from.getCreatedDate(),
                from.getLastModifiedBy(),
                from.getLastModifiedDate()
        );
    }

    public Set<Account> toAccountSet(Set<AccountEntity> accountEntities) {
        if (accountEntities == null) return Set.of();
        return accountEntities.stream().map(this::toAccount).collect(Collectors.toSet());
    }

    public AccountEntity toAccountEntity(CreateAccountRequest createAccountRequest, CustomerEntity customerEntity) {
        return AccountEntity.builder()
                .customerEntity(customerEntity)
                .balance(createAccountRequest.getBalance())
                .currencyType(createAccountRequest.getCurrencyType())
                .status(AccountStatus.ACTIVE)
                .number(createAccountRequest.getNumber())
                .build();
    }
}
