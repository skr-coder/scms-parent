package com.wcan.scms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ScmsConsummerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScmsConsummerApplication.class, args);
	}
}
