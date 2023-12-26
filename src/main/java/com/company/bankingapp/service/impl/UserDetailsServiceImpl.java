package com.company.bankingapp.service.impl;

import com.company.bankingapp.repository.CustomerRepository;
import com.company.bankingapp.security.UserPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
public record UserDetailsServiceImpl(
        CustomerRepository customerRepository
) implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return customerRepository.findByUsername(username)
                .map(UserPrincipal::new)
                .orElseThrow(() -> new UsernameNotFoundException(
                        format("Customer not found with username: %s", username)));
    }
}
