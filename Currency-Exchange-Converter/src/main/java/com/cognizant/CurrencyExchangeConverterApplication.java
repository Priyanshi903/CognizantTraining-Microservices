package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class CurrencyExchangeConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeConverterApplication.class, args);
	}

}
