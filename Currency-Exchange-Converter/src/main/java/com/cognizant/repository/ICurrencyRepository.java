package com.cognizant.repository;

import org.springframework.stereotype.Repository;

import com.cognizant.model.ExchangeValue;

@Repository
public interface ICurrencyRepository {
	public ExchangeValue findByFromAndTo(String from, String to);

}