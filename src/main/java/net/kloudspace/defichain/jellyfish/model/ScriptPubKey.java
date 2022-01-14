package net.kloudspace.defichain.jellyfish.model;

public class ScriptPubKey {

	private String asm, hex, type;
	private Number reqSigs;
	private String[] addresses;

	public String getAsm() {
		return asm;
	}

	public String getHex() {
		return hex;
	}

	public String getType() {
		return type;
	}

	public Number getReqSigs() {
		return reqSigs;
	}

	public String[] getAddresses() {
		return addresses;
	}

}//Vin
