package com.lulu.finalminiproject_gateway.sportsproduct_.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreakerFactory;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JConfigBuilder;
import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;

@SpringBootApplication
@EnableDiscoveryClient


public class SportsproductGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportsproductGatewayApplication.class, args);
		
	}
	@Bean

	public Customizer<Resilience4JCircuitBreakerFactory> defaultCustomizer(){

		return factory -> factory.configureDefault(

				id -> new Resilience4JConfigBuilder(id)

						.circuitBreakerConfig(

								CircuitBreakerConfig.ofDefaults()

						).build()

		);

	}

}
