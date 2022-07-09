package com.bms.pojo;

public class Account {

	private String accountNumber;
	private Double balanace;
	private String userName;
	private Boolean isActive;

	public Account(String accountNumber, Double balanace, String userName, Boolean isActive) {
		this.accountNumber = accountNumber;
		this.balanace = balanace;
		this.userName = userName;
		this.isActive = isActive;
	}

	public Account() {
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalanace() {
		return balanace;
	}

	public void setBalanace(Double balanace) {
		this.balanace = balanace;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}
