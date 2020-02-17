package com.wcan.scms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class ScmsHytrixDashBordApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ScmsHytrixDashBordApplication.class, args);
	}

}