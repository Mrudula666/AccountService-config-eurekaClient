package com.cg.app.accountservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.accountservice.entity.Account;
import com.cg.app.accountservice.repo.AccountRepository;

@Service
public class AccountServiceImpl implements AccountServiceInterface {

	@Autowired
	private AccountRepository repository;

	@Override
	public List<Account> getAllAccounts() {

		return repository.findAll();
	}

	@Override
	public void addAccount(Account account) {
		repository.save(account);

	}

	@Override
	public void deleteAccount(int accountNumber) {
		repository.deleteById(accountNumber);

	}

	@Override
	public Optional<Account> getAccountById(int accountNumber) {
		Optional<Account> account = repository.findById(accountNumber);

		return account;
	}

	@Override
	public void updateAccount(Account updatedAccount) {
		repository.save(updatedAccount);

	}

	@Override
	public Double getCurrentBalance(int accountNumber) {

		Optional<Account> account = repository.findById(accountNumber);
		Double currentBalance=account.get().getCurrentBalance();
		return currentBalance;

	}

	@Override
	public void updateBalance(Account updatedAccount) {
		repository.save(updatedAccount);
	}

}
