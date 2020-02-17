package com.wcan.scms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ScmsZuulApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ScmsZuulApplication.class, args);
	}

}