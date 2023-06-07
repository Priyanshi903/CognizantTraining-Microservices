package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.ExchangeValue;
import com.cognizant.repository.ICurrencyRepository;

@RestController
public class CurrencyController {
	@Autowired
	private ICurrencyRepository iCurrencyRepository;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange-service/from/{from}/to/{to}")
	public ExchangeValue retreiveCurrency(@PathVariable String from,@PathVariable String to) {
		ExchangeValue exchangeValue=iCurrencyRepository.findByFromAndTo(from, to);
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchangeValue;
	}

}
