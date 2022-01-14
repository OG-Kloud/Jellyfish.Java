package net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.options;

import net.kloudspace.defichain.jellyfish.Options;

public class CreateRawTxIn extends Options {

	private String txid;
	private Number vout;
	private Number sequence;
	
	

	public CreateRawTxIn(String txid, Number vout) {
		this.txid = txid;
		this.vout = vout;
	}

	public CreateRawTxIn(String txid, Number vout, Number sequence) {
		this(txid, vout);
		this.sequence = sequence;
	}

	public String getTxid() {
		return txid;
	}

	public Number getVout() {
		return vout;
	}

	public Number getSequence() {
		return sequence;
	}

	public CreateRawTxIn setSequence(Number sequence) {
		this.sequence = sequence;
		return this;
	}

}
