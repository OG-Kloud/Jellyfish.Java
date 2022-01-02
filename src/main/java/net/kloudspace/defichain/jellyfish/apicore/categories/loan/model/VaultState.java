package net.kloudspace.defichain.jellyfish.apicore.categories.loan.model;

public enum VaultState {
	
	UNKNOWN("unknown"),
	ACTIVE("active"),
	IN_LIQUIDATION("inLiquidation"),
	FROZEN("frozen"),
	MAY_LIQUIDATE("mayLiquidate");
	
	private final String state;
	
	private VaultState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}

}
