package com.cognizant.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cognizant.model.CurrencyConversion;
import com.cognizant.proxy.CurrencyExchangeServiceProxy;


@RestController
@RequestMapping("/currency-converter")
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeServiceProxy currencyExchangeServiceProxy;
	
	/*
	 * @GetMapping(
	 * "/currency-exchange-service/from/{from}/to/{to}/quantity/{quantity}") public
	 * CurrencyConversion convertCurrency(@PathVariable String from,@PathVariable
	 * String to,@PathVariable BigDecimal quantity) { Map<String,String> map=new
	 * HashMap<>(); map.put("from", from); map.put("to", to); RestTemplate
	 * restTemplate=new RestTemplate(); ResponseEntity<CurrencyConversion>
	 * response=restTemplate.getForEntity(
	 * "http://localhost:8081/currency-exchange-service/from/{from}/to/{to}",
	 * CurrencyConversion.class,map); CurrencyConversion
	 * currencyConversion=response.getBody();
	 * currencyConversion.setTotalAmount(currencyConversion.getConversionRate().
	 * multiply(quantity)); currencyConversion.setQuantity(quantity); return
	 * currencyConversion; }
	 */
	
	@GetMapping("/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion convertCurrencyWithFeign(@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal quantity) {
		CurrencyConversion currencyConversion=currencyExchangeServiceProxy.getExchangeValue(from, to);
		currencyConversion.setTotalAmount(currencyConversion.getConversionRate().multiply(quantity)); 
		currencyConversion.setQuantity(quantity);
		return currencyConversion;
	}
	
	

}
