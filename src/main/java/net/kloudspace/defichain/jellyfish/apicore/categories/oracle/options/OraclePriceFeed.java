package net.kloudspace.defichain.jellyfish.apicore.categories.oracle.options;

import net.kloudspace.defichain.jellyfish.Options;

public class OraclePriceFeed extends Options {

	private String token;
	private String currency;

	public String getToken() {
		return token;
	}

	public OraclePriceFeed setToken(String token) {
		this.token = token;
		return this;
	}

	public String getCurrency() {
		return currency;
	}

	public OraclePriceFeed setCurrency(String currency) {
		this.currency = currency;
		return this;
	}

}
