package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
@EnableDiscoveryClient
//@EnableEurekaClient
public class CurrencyExchangeConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeConverterApplication.class, args);
	}

}
