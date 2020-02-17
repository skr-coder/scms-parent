package com.wcan.scms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //把当前微服务标记为Eureka注册中心，接受其他微服务的注册
public class SpringCloudEurekaApp {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaApp.class, args);
	}

}