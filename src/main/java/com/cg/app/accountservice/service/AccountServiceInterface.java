package com.cg.app.accountservice.service;

import java.util.List;
import java.util.Optional;

import com.cg.app.accountservice.entity.Account;

public interface AccountServiceInterface {

	List<Account> getAllAccounts();

	
	void addAccount(Account account);

	void deleteAccount(int accountNumber);

	Optional<Account> getAccountById(int accountNumber);

	void updateAccount(Account updatedAccount);


	Double getCurrentBalance(int accountNumber);


	void updateBalance(Account updatedAccount);

	

	

}