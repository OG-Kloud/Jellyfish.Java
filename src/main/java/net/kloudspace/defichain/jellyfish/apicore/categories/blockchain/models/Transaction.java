package net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models;

import net.kloudspace.defichain.jellyfish.model.Vin;
import net.kloudspace.defichain.jellyfish.model.Vout;

public class Transaction {

	private String txid, hash, hex;
	private Number version, size, vsize, weight, locktime;
	private Vin[] vin;
	private Vout[] vout;

	public String getTxid() {
		return txid;
	}

	public String getHash() {
		return hash;
	}

	public String getHex() {
		return hex;
	}

	public Number getVersion() {
		return version;
	}

	public Number getSize() {
		return size;
	}

	public Number getVsize() {
		return vsize;
	}

	public Number getWeight() {
		return weight;
	}

	public Number getLocktime() {
		return locktime;
	}

	public Vin[] getVin() {
		return vin;
	}

	public Vout[] getVout() {
		return vout;
	}

}
