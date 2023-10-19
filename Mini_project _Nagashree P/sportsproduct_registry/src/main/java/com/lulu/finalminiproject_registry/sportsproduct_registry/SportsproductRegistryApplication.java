package com.lulu.finalminiproject_registry.sportsproduct_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer

@SpringBootApplication
public class SportsproductRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportsproductRegistryApplication.class, args);
	}

}
