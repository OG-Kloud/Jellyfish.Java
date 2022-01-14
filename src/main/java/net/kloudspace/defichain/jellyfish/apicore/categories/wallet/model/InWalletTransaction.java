package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model;

import java.math.BigDecimal;

public class InWalletTransaction {

	private BigDecimal amount;
	private BigDecimal fee;
	private Number confirmations;
	private String blockhash;
	private Number blockindex;
	private Number blocktime;
	private String txid;
	private Number time;
	private Number timereceived;
	private BIP215 bipreplaceable;
	private InWalletTransactionDetail[] details;
	private String hex;

	public BigDecimal getAmount() {
		return amount;
	}

	public BigDecimal getFee() {
		return fee;
	}

	public Number getConfirmations() {
		return confirmations;
	}

	public String getBlockhash() {
		return blockhash;
	}

	public Number getBlockindex() {
		return blockindex;
	}

	public Number getBlocktime() {
		return blocktime;
	}

	public String getTxid() {
		return txid;
	}

	public Number getTime() {
		return time;
	}

	public Number getTimereceived() {
		return timereceived;
	}

	public BIP215 getBipreplaceable() {
		return bipreplaceable;
	}

	public InWalletTransactionDetail[] getDetails() {
		return details;
	}

	public String getHex() {
		return hex;
	}

	public static class InWalletTransactionDetail {
		private String addresss;
		private InWalletTransactionCategory category;
		private BigDecimal amount;
		private String label;
		private Number vout;
		private BigDecimal fee;
		private boolean abandoned;

		public String getAddresss() {
			return addresss;
		}

		public InWalletTransactionCategory getCategory() {
			return category;
		}

		public BigDecimal getAmount() {
			return amount;
		}

		public String getLabel() {
			return label;
		}

		public Number getVout() {
			return vout;
		}

		public BigDecimal getFee() {
			return fee;
		}

		public boolean isAbandoned() {
			return abandoned;
		}

	}

}
