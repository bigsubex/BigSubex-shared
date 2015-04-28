package com.doj.big.subex.repository;

import org.springframework.stereotype.Repository;

import com.doj.big.subex.domain.Account;

/**
 * JPA based {@link EmployeeRepository} implementation.
 *  
 * @author Dinesh Rajput
 *
 */
@Repository("accountRepository")
public class JpaEmployeeRepository implements EmployeeRepository {

//    @PersistenceContext
//    private EntityManager entityManager;

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
    public Account save(Account account1) {
        /*if (account.getId() != null) {
            return this.entityManager.merge(account);
        } else {
            this.entityManager.persist(account);
            return account;
        }*/
    	Account account = new Account();
    	account.setPassword("rajput");
    	account.setUsername("dinesh");
    	return account;
    }

}
