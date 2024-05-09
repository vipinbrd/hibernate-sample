package com.vipin.repository;

import java.util.List;

import com.vipin.entity.Account;

public interface AccountRepo { 
	
	public String  createAccount(Account account);
	public String updateAccount(Account account);
	public Account deleteAccount(Account account);
	public List<Account> getAllAccount();

}
