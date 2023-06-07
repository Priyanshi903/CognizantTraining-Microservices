package com.cognizant.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyConversion {
	private long id;
	private String from;
	private String to;
	private BigDecimal quantity;
	private BigDecimal conversionRate;
	private BigDecimal totalAmount;
	private int port;

}
