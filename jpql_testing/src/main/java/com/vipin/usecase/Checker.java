package com.vipin.usecase;

import java.util.List;

import com.vipin.entity.Account;
import com.vipin.repository.AccountRepo;
import com.vipin.service.AccountService;

public class Checker {
	
	
	public static void main(String[] args) {
		AccountRepo ar= new AccountService();
//		
		Account ac=new Account("vipin",75000);
		ac.setAccountNumber(1);
//		Account ac1=new Account("shourya",74000);
//		Account ac2=new Account("manish",76000);
//		
//		
//
//;
//		String str=ar.createAccount(ac2);
//		System.out.println(str);
//		
//		List<Account>la=ar.getAllAccount();
//		System.out.println(la);
		
		System.out.println(ar.deleteAccount(ac));
	}

}
