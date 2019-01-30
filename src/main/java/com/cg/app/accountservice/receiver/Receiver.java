package com.cg.app.accountservice.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.app.accountservice.resource.AccountResource;
import com.cg.app.transactionservice.entity.Transaction;

@Component
public class Receiver {
	@Autowired
	private AccountResource resource;
	
	@RabbitListener(queues = "transactionQ")
	public void receive(Transaction transaction) {
		resource.updateBalance(transaction);
	}
}
