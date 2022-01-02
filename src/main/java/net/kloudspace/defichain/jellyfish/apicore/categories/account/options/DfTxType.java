package net.kloudspace.defichain.jellyfish.apicore.categories.account.options;

public enum DfTxType {
	MINT_TOKEN("M"),
	POOL_SWAP("s"),
	ADD_POOL_LIQUIDITY("l"),
	REMOVE_POOL_LIQUIDITY("r"),
	UTXOS_TO_ACCOUNT("U"),
	ACCOUNT_TO_UTXO("b"),
	ACCOUNT_TO_ACCOUNT("B"),
	ANY_ACCOUNTS_TO_ACCOUNTS("a"),
	CREATE_MASTERNODE("C"),
	RESIGN_MASTERNODE("R"),
	CREATE_TOKEN("T"),
	UPDATE_TOKEN("N"),
	UPDATE_TOKEN_ANY("n"),
	CREATE_POOL_PAIR("p"),
	UPDATE_POOL_PAIR("u"),
	SET_GOV_VARIABLE("G"),
	AUTO_AUTH_PREP("A"),
	NONE("0")
	;
	
	private String id;
	
	DfTxType(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

}
