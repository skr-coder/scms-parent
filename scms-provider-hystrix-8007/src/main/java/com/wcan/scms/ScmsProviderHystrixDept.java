package com.wcan.scms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker //启用对Hystrix熔断机制的支持
public class ScmsProviderHystrixDept {
	
	public static void main(String[] args) {
		SpringApplication.run(ScmsProviderHystrixDept.class, args);
	}

}