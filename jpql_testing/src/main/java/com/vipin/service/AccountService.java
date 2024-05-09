package com.vipin.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.vipin.entity.Account;
import com.vipin.repository.AccountRepo;
import com.vipin.utilty.EntityManagerProvider;

public class AccountService  implements AccountRepo{
	 
EntityManager em=EntityManagerProvider.getmanager();

	@Override
	public String createAccount(Account account) {
		em.getTransaction().begin();
		em.persist(account);
		em.getTransaction().commit();
		em.close();
		return "inserted successfull";
	}

	@Override
	public String updateAccount(Account account) {
		
		Query  query=em.createQuery("update Account set name=?1 where name='vipin'");
		       query.setParameter(1,"alpha");
		       em.getTransaction().begin();
		       int a=query.executeUpdate();
		       em.getTransaction().commit();
		       em.close();
		
		return a+" row affected";
	}

	@Override
	public Account deleteAccount(Account account) {
		 Query query= em.createQuery("delete from Account where accountNumber=:ac");
		 query.setParameter("ac", account.getAccountNumber());
		  em.getTransaction().begin();
	       int a=query.executeUpdate();
	       em.getTransaction().commit();
	       em.close();
		return account;
	}

	@Override
	public List<Account> getAllAccount() {
		TypedQuery<Account> gar= em.createQuery("from Account",Account.class);
		List<Account>allAccount=gar.getResultList()
;
		return allAccount;
	}

}
