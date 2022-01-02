package net.kloudspace.defichain.jellyfish.apicore.categories.loan.model;

public abstract class Vault {

	protected String vaultId;
	protected String loanSchemeId;
	protected String ownerAddress;
	protected VaultState state;
	
	public abstract void print();

	public String getVaultId() {
		return vaultId;
	}

	public String getLoanSchemeId() {
		return loanSchemeId;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public VaultState getState() {
		return state;
	}
	

}
