package net.kloudspace.defichain.jellyfish.apicore.categories.oracle.model;

import java.math.BigDecimal;

public class FixedIntervalPrice {

	private Number activePriceBlock;
	private Number nextPriceBlock;
	private Number timestamp;
	private String fixedIntervalPriceId;
	private BigDecimal activePrice;
	private BigDecimal nextPrice;
	private boolean isLive;

	public Number getActivePriceBlock() {
		return activePriceBlock;
	}

	public Number getNextPriceBlock() {
		return nextPriceBlock;
	}

	public Number getTimestamp() {
		return timestamp;
	}

	public String getFixedIntervalPriceId() {
		return fixedIntervalPriceId;
	}

	public BigDecimal getActivePrice() {
		return activePrice;
	}

	public BigDecimal getNextPrice() {
		return nextPrice;
	}

	public boolean isLive() {
		return isLive;
	}

}
