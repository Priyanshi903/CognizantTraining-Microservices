package com.cognizant.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cognizant.model.CurrencyConversion;

//@FeignClient(name = "currency-exchange-service", url = "localhost:8081")
@FeignClient(name = "currency-exchange-service")
public interface CurrencyExchangeServiceProxy {
	@GetMapping("currency-exchange-service/from/{from}/to/{to}")
	public CurrencyConversion getExchangeValue(@PathVariable String from, @PathVariable String to);

}