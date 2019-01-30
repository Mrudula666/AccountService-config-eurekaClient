package com.cg.app.accountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AccountService {

	public static void main(String[] args) {
		SpringApplication.run(AccountService.class, args);
	}

}

