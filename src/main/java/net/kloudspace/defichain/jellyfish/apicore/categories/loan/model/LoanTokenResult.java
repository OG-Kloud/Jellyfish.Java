package net.kloudspace.defichain.jellyfish.apicore.categories.loan.model;

import java.math.BigDecimal;

import net.kloudspace.defichain.jellyfish.apicore.categories.token.model.TokenResult;

public class LoanTokenResult {

	private TokenResult token;
	private String fixedIntervalPriceId;
	private BigDecimal interest;

	public TokenResult getToken() {
		return token;
	}

	public String getFixedIntervalPriceId() {
		return fixedIntervalPriceId;
	}

	public BigDecimal getInterest() {
		return interest;
	}

}
