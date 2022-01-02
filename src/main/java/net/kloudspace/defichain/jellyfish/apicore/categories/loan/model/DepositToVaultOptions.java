package net.kloudspace.defichain.jellyfish.apicore.categories.loan.model;

import net.kloudspace.defichain.jellyfish.Options;

public class DepositToVaultOptions extends Options {

	private String vaultId;
	private String from;
	private String amount;// in amount@symbol format

	public DepositToVaultOptions(String vaultid, String from, String amount) {
		this.vaultId = vaultid;
		this.from = from;
		this.amount = amount;
	}

	public String getVaultId() {
		return vaultId;
	}

	public String getFrom() {
		return from;
	}

	public String getAmount() {
		return amount;
	}

}
