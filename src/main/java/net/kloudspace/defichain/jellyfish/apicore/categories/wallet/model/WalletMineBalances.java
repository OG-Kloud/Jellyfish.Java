package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model;

import java.math.BigDecimal;

public class WalletMineBalances {

	private BigDecimal trusted;
	private BigDecimal untrusted_pending;
	private BigDecimal immature;
	private BigDecimal used;

	public BigDecimal getTrusted() {
		return trusted;
	}

	public BigDecimal getUntrusted_pending() {
		return untrusted_pending;
	}

	public BigDecimal getImmature() {
		return immature;
	}

	public BigDecimal getUsed() {
		return used;
	}

}
