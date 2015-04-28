package com.doj.big.subex.service;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.doj.big.subex.domain.Account;
import com.doj.big.subex.repository.EmployeeRepository;
import com.doj.big.subex.service.exception.AuthenticationException;

/**
 * @see LoginService
 * @author Dinesh Rajput
 *
 */
@Service("accountService")
@Transactional(readOnly = true)
public class LoginServiceImpl implements LoginService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	@Transactional(readOnly = false)
	public Account save(Account account) {
		return this.employeeRepository.save(account);
	}

	@Override
	public Account login(String email, String password) throws AuthenticationException {
		Account account = this.employeeRepository.findByEmail(email);
		if (account != null) {
			if (!account.getPassword().equalsIgnoreCase(password)) {
				throw new AuthenticationException("Wrong username/password combination.", "invalid.password");
			}
		} else {
			throw new AuthenticationException("Wrong username/password combination.", "invalid.username");
		}

		return account;
	}

	@Override
	public Account getAccount(String email) {
		return this.employeeRepository.findByEmail(email);
	}
}
