package net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.options;

import java.math.BigDecimal;

import net.kloudspace.defichain.jellyfish.Options;

public class PoolSwapOptions extends Options {
	
	private final String from;
	private final String tokenFrom;
	private final BigDecimal amountFrom;
	private final String to;
	private final String tokenTo;
	private final BigDecimal maxPrice;
	
	public PoolSwapOptions(String fromAddress, String tokenfrom, BigDecimal amountfrom, String toAddress, String tokento, BigDecimal maxprice) {
		this.from = fromAddress;
		this.tokenFrom = tokenfrom;
		this.amountFrom = amountfrom;
		this.to = toAddress;
		this.tokenTo = tokento;
		this.maxPrice = maxprice;
	}

	public String getFrom() {
		return from;
	}

	public String getTokenFrom() {
		return tokenFrom;
	}

	public BigDecimal getAmountFrom() {
		return amountFrom;
	}

	public String getTo() {
		return to;
	}

	public String getTokenTo() {
		return tokenTo;
	}

	public BigDecimal getMaxPrice() {
		return maxPrice;
	}
	
	

}
