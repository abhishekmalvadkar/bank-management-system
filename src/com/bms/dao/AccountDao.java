package com.bms.dao;

import java.util.ArrayList;
import java.util.List;

import com.bms.pojo.Account;

public class AccountDao {
	
	private static List<Account> accounts = new ArrayList<>();
	
	public void createAccount(Account account) {
		System.out.println("<<<<<<<<<<< createAccount");
		accounts.add(account);
		System.out.println("createAccount >>>>>>>>>>>>>");
	}

}
