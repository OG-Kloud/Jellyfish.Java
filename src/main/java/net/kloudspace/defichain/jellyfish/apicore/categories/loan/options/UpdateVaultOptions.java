package net.kloudspace.defichain.jellyfish.apicore.categories.loan.options;

public class UpdateVaultOptions {
	
	private final String vaultOwnersAddress;
	private final String loanSchemeId;
	public UpdateVaultOptions(String vaultownersaddress, String loanschemeid) {
		this.vaultOwnersAddress = vaultownersaddress;
		this.loanSchemeId = loanschemeid;
	}
	public String getVaultOwnersAddress() {
		return vaultOwnersAddress;
	}
	public String getLoanSchemeId() {
		return loanSchemeId;
	}
	
	

}
