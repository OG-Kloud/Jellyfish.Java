package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model;

import java.math.BigDecimal;

public class WalletInfo {

	private String walletname;
	private Number walletversion;
	private BigDecimal balance;
	private BigDecimal unconfirmed_balance;
	private BigDecimal immature_balance;
	private Number txcount;
	private Number keypoololdest;
	private Number keypoolsize;
	private Number keypoolsize_hd_internal;
	private Number unlocked_until;
	private BigDecimal paytxfee;
	private String hdseedid;
	private boolean private_keys_enabled;
	private boolean avoid_reuse;
	private Scanning scanning;

	public String getWalletname() {
		return walletname;
	}

	public Number getWalletversion() {
		return walletversion;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public BigDecimal getUnconfirmed_balance() {
		return unconfirmed_balance;
	}

	public BigDecimal getImmature_balance() {
		return immature_balance;
	}

	public Number getTxcount() {
		return txcount;
	}

	public Number getKeypoololdest() {
		return keypoololdest;
	}

	public Number getKeypoolsize() {
		return keypoolsize;
	}

	public Number getKeypoolsize_hd_internal() {
		return keypoolsize_hd_internal;
	}

	public Number getUnlocked_until() {
		return unlocked_until;
	}

	public BigDecimal getPaytxfee() {
		return paytxfee;
	}

	public String getHdseedid() {
		return hdseedid;
	}

	public boolean isPrivate_keys_enabled() {
		return private_keys_enabled;
	}

	public boolean isAvoid_reuse() {
		return avoid_reuse;
	}

	public Scanning getScanning() {
		return scanning;
	}

	public static class Scanning {
		private Number duration;
		private Number progress;

		public Number getDuration() {
			return duration;
		}

		public Number getProgress() {
			return progress;
		}

	}

}
