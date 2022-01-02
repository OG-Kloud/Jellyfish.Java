package net.kloudspace.defichain.jellyfish.apicore.categories.account.model;

public class AccountOwner {

	private String ASM;
	private Number reqSigs;
	private String type;
	private String[] addresses;

	public String getASM() {
		return ASM;
	}

	public Number getReqSigs() {
		return reqSigs;
	}

	public String getType() {
		return type;
	}

	public String[] getAddresses() {
		return addresses;
	}

}