package net.kloudspace.defichain.jellyfish.apicore.categories.loan.options;

import net.kloudspace.defichain.jellyfish.Options;

public class TakeLoanOptions extends Options {
	
	private String vaultId;
	private String[] amounts;
	private String to;
	
	public TakeLoanOptions(String vault, String[] amounts, String to) {
		this.vaultId = vault;
		this.amounts = amounts;
		this.to = to;
	}

	public String getVaultId() {
		return vaultId;
	}

	public String[] getAmounts() {
		return amounts;
	}

	public String getTo() {
		return to;
	}
	
	

}
