package net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.model;

public final class SignRawTxWithKeyError {

	private String txid;
	private Number vout;
	private String scriptSig;
	private Number sequence;
	private String error;

	public String getTxid() {
		return txid;
	}

	public Number getVout() {
		return vout;
	}

	public String getScriptSig() {
		return scriptSig;
	}

	public Number getSequence() {
		return sequence;
	}

	public String getError() {
		return error;
	}

}
