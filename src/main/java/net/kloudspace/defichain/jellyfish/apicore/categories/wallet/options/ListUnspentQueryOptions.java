package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.options;

import java.math.BigDecimal;

import net.kloudspace.defichain.jellyfish.Options;

public class ListUnspentQueryOptions extends Options {

	private BigDecimal minimumAmount;
	private BigDecimal maximumAmount;
	private BigDecimal maximumCount;
	private BigDecimal minimumSumAmount;
	private String tokenId;

	public BigDecimal getMinimumAmount() {
		return minimumAmount;
	}

	public ListUnspentQueryOptions setMinimumAmount(BigDecimal minimumAmount) {
		this.minimumAmount = minimumAmount;
		return this;
	}

	public BigDecimal getMaximumAmount() {
		return maximumAmount;
	}

	public ListUnspentQueryOptions setMaximumAmount(BigDecimal maximumAmount) {
		this.maximumAmount = maximumAmount;
		return this;
	}

	public BigDecimal getMaximumCount() {
		return maximumCount;
	}

	public ListUnspentQueryOptions setMaximumCount(BigDecimal maximumCount) {
		this.maximumCount = maximumCount;
		return this;
	}

	public BigDecimal getMinimumSumAmount() {
		return minimumSumAmount;
	}

	public ListUnspentQueryOptions setMinimumSumAmount(BigDecimal minimumSumAmount) {
		this.minimumSumAmount = minimumSumAmount;
		return this;
	}

	public String getTokenId() {
		return tokenId;
	}

	public ListUnspentQueryOptions setTokenId(String tokenId) {
		this.tokenId = tokenId;
		return this;
	}

}
