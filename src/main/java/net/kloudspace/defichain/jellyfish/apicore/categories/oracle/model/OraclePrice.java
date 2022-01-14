package net.kloudspace.defichain.jellyfish.apicore.categories.oracle.model;

public class OraclePrice {

	private String tokenAmount;
	private String currency;

	public String getTokenAmount() {
		return tokenAmount;
	}

	public OraclePrice setTokenAmount(String tokenAmount) {
		this.tokenAmount = tokenAmount;
		return this;
	}

	public String getCurrency() {
		return currency;
	}

	public OraclePrice setCurrency(String currency) {
		this.currency = currency;
		return this;
	}

}
