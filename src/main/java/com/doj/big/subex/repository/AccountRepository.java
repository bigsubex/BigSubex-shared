package com.doj.big.subex.repository;

import com.doj.big.subex.domain.Account;

/**
 * Repository for working with {@link Account} domain objects
 * 
 * @author Dinesh Rajput
 *
 */
public interface AccountRepository {

    Account findByUsername(String username);

    Account findById(long id);

    Account save(Account account);

}
