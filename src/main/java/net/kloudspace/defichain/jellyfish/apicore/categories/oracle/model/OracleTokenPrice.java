package net.kloudspace.defichain.jellyfish.apicore.categories.oracle.model;

import java.math.BigDecimal;

public class OracleTokenPrice {

	private String token;
	private String currency;
	private BigDecimal amount;
	private Number timestamp;

	public String getToken() {
		return token;
	}

	public String getCurrency() {
		return currency;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public Number getTimestamp() {
		return timestamp;
	}

}
