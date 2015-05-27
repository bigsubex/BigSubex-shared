package com.doj.big.subex.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.doj.big.subex.domain.Account;

/**
 * JPA based {@link EmployeeRepository} implementation.
 *  
 * @author Dinesh Rajput
 *
 */
@Repository("accountRepository")
@Transactional
public class JpaEmployeeRepository implements EmployeeRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Account findByEmail(String email) {
        /*String hql = "select c from Account c where c.username=:username";
        TypedQuery<Account> query = this.entityManager.createQuery(hql, Account.class).setParameter("username",
                username);
        List<Account> accounts = query.getResultList();

        return accounts.size() == 1 ? accounts.get(0) : null;*/
    	Account account = new Account();
    	account.setPassword("rajput");
    	account.setUsername("dinesh");
    	return account;
    }

    @Override
    public Account findById(long id) {
        //return this.entityManager.find(Account.class, id);
    	Account account = new Account();
    	account.setPassword("rajput");
    	account.setUsername("dinesh");
    	return account;
    }

    @Override
    public Account save(Account account) {
        if (account.getId() != null) {
            return em.merge(account);
        } else {
        	em.persist(account);
            return account;
        }
    }

}
