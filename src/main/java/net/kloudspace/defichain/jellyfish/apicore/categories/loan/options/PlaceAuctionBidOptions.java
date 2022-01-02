package net.kloudspace.defichain.jellyfish.apicore.categories.loan.options;

import net.kloudspace.defichain.jellyfish.Options;

public class PlaceAuctionBidOptions extends Options {
	
	private String vaultId;
	private Number index;
	private String from;
	private String amount;
	
	public PlaceAuctionBidOptions(String vault, Number batchindex, String from, String amount) {
		this.vaultId = vault;
		this.index = batchindex;
		this.from = from;
		this.amount = amount;
	}

	public String getVaultId() {
		return vaultId;
	}

	public Number getIndex() {
		return index;
	}

	public String getFrom() {
		return from;
	}

	public String getAmount() {
		return amount;
	}
	
	

}
