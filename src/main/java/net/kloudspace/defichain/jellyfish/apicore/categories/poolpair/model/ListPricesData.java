package net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.model;

import java.math.BigDecimal;

public class ListPricesData {

	private String token;
	private String currency;
	private BigDecimal price;
	private boolean ok;

	public String getToken() {
		return token;
	}

	public String getCurrency() {
		return currency;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public boolean isOk() {
		return ok;
	}

}
