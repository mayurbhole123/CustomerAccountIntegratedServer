package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Entry point of the spring application with configuration of eureka server.
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class CustomerAccountIntegratedServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerAccountIntegratedServerApplication.class, args);
	}

}
