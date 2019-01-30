package com.cg.app.accountservice.entity;

public class SavingsAccount{
	private Account account;
	private boolean salary;

	public SavingsAccount() {
		
	}

	public SavingsAccount(Account account, boolean salary) {
		super();
		this.account = account;
		this.salary = salary;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public boolean isSalary() {
		return salary;
	}

	public void setSalary(boolean salary) {
		this.salary = salary;
	}

	
}
