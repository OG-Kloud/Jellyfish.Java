package net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.options;

public enum SigHashType {

	ALL("ALL"), NONE("NONE"), SINGLE("SINGLE"), ALL_ANYONECANPAY("ALL|ANYONECANPAY"),
	NONE_ANYONECANPAY("NONE|ANYONECANPAY"), SINGLE_ANYONECANPAY("SINGLE|ANYONECANPAY");

	private final String ID;

	SigHashType(String id) {
		this.ID = id;
	}

	public String getID() {
		return ID;
	}
	
	

}
