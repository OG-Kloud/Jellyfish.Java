package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model;

public class ValidateAddressResult {

	private boolean isvalid;
	private String address;
	private String scriptPubKey;
	private boolean isscript;
	private boolean iswitness;
	private Number witness_version;
	private String witness_program;

	public boolean isIsvalid() {
		return isvalid;
	}

	public String getAddress() {
		return address;
	}

	public String getScriptPubKey() {
		return scriptPubKey;
	}

	public boolean isIsscript() {
		return isscript;
	}

	public boolean isIswitness() {
		return iswitness;
	}

	public Number getWitness_version() {
		return witness_version;
	}

	public String getWitness_program() {
		return witness_program;
	}

}
