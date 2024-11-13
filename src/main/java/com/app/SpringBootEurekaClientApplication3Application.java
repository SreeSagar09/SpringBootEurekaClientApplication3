package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringBootEurekaClientApplication3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaClientApplication3Application.class, args);
		System.out.println("SpringBootEurekaClientApplication3Application is started..");
	}

}
