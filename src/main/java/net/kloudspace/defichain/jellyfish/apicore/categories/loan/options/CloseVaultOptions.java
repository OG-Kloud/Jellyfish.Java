package net.kloudspace.defichain.jellyfish.apicore.categories.loan.options;

import net.kloudspace.defichain.jellyfish.Options;

public class CloseVaultOptions extends Options{
	
	private String vaultId;
	private String to;
	
	public CloseVaultOptions(String vaultid, String toAddress) {
		this.vaultId = vaultid;
		this.to = toAddress;
	}
	
	public CloseVaultOptions() {
		this(null, null);
	}
	
	@Override
	public String getAsParameter() {
		return "\"" +this.vaultId + "\",\"" + this.to+"\"";
	}

}
