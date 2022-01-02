package net.kloudspace.defichain.jellyfish.apicore.categories.loan.options;

import net.kloudspace.defichain.jellyfish.Options;

public class WithdrawFromVaultOptions extends Options {
	
	private String vaultId;
	private String to;
	private String amount; //amount@symbol

	public WithdrawFromVaultOptions(String vaultid, String to, String amount) {
		this.vaultId = vaultid;
		this.to = to;
		this.amount = amount;
	}

	public String getVaultId() {
		return vaultId;
	}

	public String getTo() {
		return to;
	}

	public String getAmount() {
		return amount;
	}
	
	
	
}
