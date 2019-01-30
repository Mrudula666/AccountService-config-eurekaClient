package com.cg.app.accountservice;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;



@EnableDiscoveryClient
@SpringBootApplication
public class AccountService {

	public static void main(String[] args) {
		SpringApplication.run(AccountService.class, args);
	}
	
	@Bean
	public Queue queue() {
		return new Queue("transactionQ",false);
	}

}

