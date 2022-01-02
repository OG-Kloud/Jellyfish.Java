package net.kloudspace.defichain.jellyfish.apicore.categories.loan.model;

import java.math.BigDecimal;

public class CollateralTokenDetail {

	private String token;
	private BigDecimal factor;
	private String fixedIntervalPriceId;
	private Number activateAfterBlock;
	private String tokenId;

	public String getToken() {
		return token;
	}

	public BigDecimal getFactor() {
		return factor;
	}

	public String getFixedIntervalPriceId() {
		return fixedIntervalPriceId;
	}

	public Number getActivateAfterBlock() {
		return activateAfterBlock;
	}

	public String getTokenId() {
		return tokenId;
	}

}
