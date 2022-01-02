package net.kloudspace.defichain.jellyfish.model;

import com.google.gson.Gson;

public class UTXO {
	
	private final String txid;
	private final int vout;
	
	public UTXO(String transactionId, int vouts) {
		this.txid = transactionId;
		this.vout = vouts;
	}

	public String getTxid() {
		return txid;
	}

	public int getVout() {
		return vout;
	}
	
	public String toJsonObjectString() {
		if(this.txid == null || this.txid.equals(""))return "{}";
		return new Gson().toJson(this);
	}
	
	

}
