package com.cg.app.accountservice.entity;




import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Account {

	@Id
	private Integer accountNumber;
	private String accountHolderName;
	private Double currentBalance;

	public Account() {
	}

	public Account(Integer accountNumber, String accountHolderName) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
	}

	public Account(Integer accountNumber, String accountHolderName, Double currentBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.currentBalance = currentBalance;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public Double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(Double currentBalance) {
		this.currentBalance = currentBalance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountHolderName == null) ? 0 : accountHolderName.hashCode());
		result = prime * result + accountNumber;
		result = prime * result + ((currentBalance == null) ? 0 : currentBalance.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountHolderName == null) {
			if (other.accountHolderName != null)
				return false;
		} else if (!accountHolderName.equals(other.accountHolderName))
			return false;
		if (accountNumber != other.accountNumber)
			return false;
		if (currentBalance == null) {
			if (other.currentBalance != null)
				return false;
		} else if (!currentBalance.equals(other.currentBalance))
			return false;
		return true;
	}

}
