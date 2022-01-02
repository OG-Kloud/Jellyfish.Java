package net.kloudspace.defichain.jellyfish.apicore.categories.loan.options;

import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.VaultState;

public class ListVaultOptions {

	private final String ownerAddress;
	private final String loanSchemeId;
	private final VaultState state;
	private final boolean verbose;

	public ListVaultOptions(String owneraddress, String schemeId, VaultState state, boolean verb) {
		if(owneraddress==null || owneraddress.isBlank())this.ownerAddress=null;else this.ownerAddress = owneraddress;
		this.loanSchemeId = schemeId;
		this.state = state;
		this.verbose = verb;
		
	}
	/**
	 * Conveniece Constructor for default options to list vaults by any owner
	 */
	public ListVaultOptions() {
		this(null, "",VaultState.UNKNOWN, true);//default options
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public String getLoanSchemeId() {
		return loanSchemeId;
	}

	public VaultState getState() {
		return state;
	}

	public boolean isVerbose() {
		return verbose;
	}
	
	

}
