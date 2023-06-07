package com.cognizant.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeValue {
	private long id;
	private String from;
	private String to;
	private BigDecimal conversionRate;
	private int port;
	public ExchangeValue(long id, String from, String to, BigDecimal conversionRate) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionRate = conversionRate;
	}
	

}
