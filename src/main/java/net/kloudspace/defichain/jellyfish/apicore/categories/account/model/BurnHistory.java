package net.kloudspace.defichain.jellyfish.apicore.categories.account.model;

public class BurnHistory {

	private String owner;
	private Number blockHeight;
	private String blockHash;
	private Number blockTime;
	private String type;
	private Number txn;
	private String txid;
	private String[] amounts;

	public String getOwner() {
		return owner;
	}

	public Number getBlockHeight() {
		return blockHeight;
	}

	public String getBlockHash() {
		return blockHash;
	}

	public Number getBlockTime() {
		return blockTime;
	}

	public String getType() {
		return type;
	}

	public Number getTxn() {
		return txn;
	}

	public String getTxid() {
		return txid;
	}

	public String[] getAmounts() {
		return amounts;
	}

}
