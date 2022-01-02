package net.kloudspace.defichain.jellyfish.apicore.categories.loan.model;

public class VaultLiquidationBatch {
	
	private Number index;
	private String[] collaterals;
	private String loan;
	private HighestBid highestBid;
	
	
	public Number getIndex() {
		return index;
	}
	public String[] getCollaterals() {
		return collaterals;
	}
	public String getLoan() {
		return loan;
	}
	public HighestBid getHighestBid() {
		return highestBid;
	}
	
	
}
