package com.cg.app.accountservice.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.accountservice.entity.Account;
import com.cg.app.accountservice.service.AccountServiceInterface;
import com.cg.app.transactionservice.entity.Transaction;

@RestController
@RequestMapping("/accounts")
public class AccountResource {
	@Autowired
	private AccountServiceInterface service;
	/* private SavingsAccount savingAccount; */

	/*
	 * @GetMapping private String getAccounts() { System.out.println("Ujj"); return
	 * "Ujwala"; }
	 */

	@GetMapping
	private List<Account> getAccounts() {
		return service.getAllAccounts();
	}

	
	@PostMapping("/account")
	private void addNewAccount(@RequestBody Account account) {
		service.addAccount(account);
		
	}

	@DeleteMapping("/{accountNumber}")
	private void deleteAccount(@PathVariable int accountNumber) {
		service.deleteAccount(accountNumber);
	}

	@GetMapping("/{accountNumber}")
	private Optional<Account> getAccountByNumber(@PathVariable int accountNumber) {
		return service.getAccountById(accountNumber);
	}

	
	/*
	 * @PutMapping("/{accountNumber}") private void updateBalance(@PathVariable int
	 * accountNumber, @RequestParam("currentBalance") double currentBalance) {
	 * Optional<Account> entity = service.getAccountById(accountNumber); Account
	 * updatedAccount = entity.get();
	 * updatedAccount.setCurrentBalance(currentBalance);
	 * System.out.println(currentBalance); service.updateBalance(updatedAccount); }
	 */
	 

	@GetMapping("/{accountNumber}/balance")
	private Double getCurrentBalance(@PathVariable Integer accountNumber) {
		System.out.println("accountNumber " + accountNumber);
		return service.getCurrentBalance(accountNumber);	
	}
	@PutMapping()
	private void updateAccount(@RequestParam Integer accountNumber) {
		Optional<Account> entity = service.getAccountById(accountNumber);
		Account updatedAccount = entity.get();
		service.updateAccount(updatedAccount);
	}


	public void updateBalance(Transaction transaction) {
		Optional<Account> entity = service.getAccountById(transaction.getAccountNumber());
		Account updatedAccount = entity.get();
		updatedAccount.setCurrentBalance(transaction.getCurrentBalance());
		
		 Double currentBalance = transaction.getCurrentBalance();
		System.out.println("Updated balance: "+currentBalance ); 
		service.updateBalance(updatedAccount);		
	}

}
