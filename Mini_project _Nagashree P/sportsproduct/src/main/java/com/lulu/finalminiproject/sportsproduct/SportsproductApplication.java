package com.lulu.finalminiproject.sportsproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class SportsproductApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportsproductApplication.class, args);
	}

}
