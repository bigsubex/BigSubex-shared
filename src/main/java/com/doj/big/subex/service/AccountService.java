package com.doj.big.subex.service;

import org.springframework.stereotype.Service;

import com.doj.big.subex.domain.Account;
import com.doj.big.subex.service.exception.AuthenticationException;

/**
 * Contract for services that work with an {@link Account}.
 * 
 * @author Dinesh Rajput
 *
 */
@Service("accountService")
public interface AccountService {

    Account save(Account account);

    /**
     * Handles the login logic. If the {@link Account} can be retrieved and the password is correct we get the
     * {@link Account}. In all other cases we get a {@link AuthenticationException}.
     * @param username the username
     * @param password the password
     * @return the account
     * @throws AuthenticationException if account not found or incorrect password
     */
    Account login(String username, String password) throws AuthenticationException;

    Account getAccount(String username);
}
