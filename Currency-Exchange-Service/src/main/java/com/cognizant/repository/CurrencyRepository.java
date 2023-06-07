package com.cognizant.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cognizant.model.ExchangeValue;

@Repository
public class CurrencyRepository implements ICurrencyRepository {

	static List<ExchangeValue> values;

	static {
		values = new ArrayList<>();
		values.add(new ExchangeValue(101l, "USD", "INR", new BigDecimal(70)));
		values.add(new ExchangeValue(102l, "EUR", "INR", new BigDecimal(85)));
		values.add(new ExchangeValue(103l, "AUD", "INR", new BigDecimal(50)));
		values.add(new ExchangeValue(104l, "PON", "INR", new BigDecimal(90)));
	}

	@Override
	public ExchangeValue findByFromAndTo(String from, String to) {
		return values.stream().filter(e -> e.getFrom().equals(from) && e.getTo().equals(to)).findAny().orElse(null);
	}

}