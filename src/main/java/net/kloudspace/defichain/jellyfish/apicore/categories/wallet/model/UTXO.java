package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model;

import java.math.BigDecimal;

public class UTXO {

	private String txid;
	private String address;
	private String label;
	private String scriptPubKey;
	private String reused;
	private String desc;
	private Number vout;
	private Number tokenId;
	private Number confirmations;
	private Number redeemScript;
	private Number witnessScript;
	private BigDecimal amount;
	private boolean spendable;
	private boolean solvable;
	private boolean safe;

	public String getTxid() {
		return txid;
	}

	public String getAddress() {
		return address;
	}

	public String getLabel() {
		return label;
	}

	public String getScriptPubKey() {
		return scriptPubKey;
	}

	public String getReused() {
		return reused;
	}

	public String getDesc() {
		return desc;
	}

	public Number getVout() {
		return vout;
	}

	public Number getTokenId() {
		return tokenId;
	}

	public Number getConfirmations() {
		return confirmations;
	}

	public Number getRedeemScript() {
		return redeemScript;
	}

	public Number getWitnessScript() {
		return witnessScript;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public boolean isSpendable() {
		return spendable;
	}

	public boolean isSolvable() {
		return solvable;
	}

	public boolean isSafe() {
		return safe;
	}

}
