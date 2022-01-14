package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model;

import java.math.BigDecimal;

public class WalletWatchOnlyBalances {

	private BigDecimal trusted;
	private BigDecimal untrusted_pending;
	private BigDecimal immature;

	public BigDecimal getTrusted() {
		return trusted;
	}

	public BigDecimal getUntrusted_pending() {
		return untrusted_pending;
	}

	public BigDecimal getImmature() {
		return immature;
	}
	
	

}
