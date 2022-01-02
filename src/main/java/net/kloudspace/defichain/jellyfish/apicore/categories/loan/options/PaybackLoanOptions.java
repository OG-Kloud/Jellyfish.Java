package net.kloudspace.defichain.jellyfish.apicore.categories.loan.options;

import net.kloudspace.defichain.jellyfish.Options;

public class PaybackLoanOptions extends Options {

	private String vaultId;
	private String[] amounts;
	private String from;

	public String getVaultId() {
		return vaultId;
	}

	public String[] getAmounts() {
		return amounts;
	}

	public String getFrom() {
		return from;
	}

}
