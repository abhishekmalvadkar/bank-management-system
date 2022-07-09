package com.bms.dao;

import java.util.ArrayList;
import java.util.List;

import com.bms.exception.AccountNotFountException;
import com.bms.pojo.Account;

public class AccountDao {

	private static List<Account> accounts = new ArrayList<>();

	public void createAccount(Account account) {
		System.out.println("<<<<<<<<<<< createAccount");
		accounts.add(account);
		System.out.println("createAccount >>>>>>>>>>>>>");
	}

	public List<Account> getAllAccounts() {
		return accounts;
	}

	public void depositeMoney(Double money, String accountNumber) {
		System.out.println("<<<<<<<<<<< depositeMoney");
		Account account = getAccountByNumber(accountNumber);

		if (account != null) {
			boolean isRemoved = accounts.remove(account);
			System.out.println("Old account remove status " + isRemoved);

			Double oldBalance = account.getBalanace();
			Double newBalance = oldBalance + money;
			account.setBalanace(newBalance);
			accounts.add(account);
		} else {
			throw new AccountNotFountException("Account does not exist for number " + accountNumber);
		}
		System.out.println("depositeMoney >>>>>>>>>>>>");
	}

	private Account getAccountByNumber(String accountNumberInput) {
		Account accountData = null;
		for (Account account : accounts) {
			String accountNumber = account.getAccountNumber();
			if (accountNumber.equals(accountNumber)) {
				accountData = account;
			}
		}
		return accountData;
	}

}
