package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model;

public enum InWalletTransactionCategory {
	SEND("send"),
	RECIVE("recive"),
	GENERATE("generate"),
	IMMATURE("immature"),
	ORPHAN("orphan")
	;
	private final String ID;
	
	private InWalletTransactionCategory(String id) {
		this.ID = id;
	}

	public String getID() {
		return ID;
	}
	
	

}
