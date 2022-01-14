package net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.options;

import java.math.BigDecimal;

import net.kloudspace.defichain.jellyfish.Options;

public class SignRawTxWithKeyPrevTx extends Options {

	private String txid;
	private Number vout;
	private String scriptPubKey;
	private String redeemScript;
	private String witnessScript;
	private BigDecimal amount;

	public String getTxid() {
		return txid;
	}

	public Number getVout() {
		return vout;
	}

	public String getScriptPubKey() {
		return scriptPubKey;
	}

	public String getRedeemScript() {
		return redeemScript;
	}

	public String getWitnessScript() {
		return witnessScript;
	}

	public BigDecimal getAmount() {
		return amount;
	}

}
