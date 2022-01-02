package net.kloudspace.defichain.jellyfish.apicore.categories.loan.options;

public class AuctionPaginationStart {
	
	private String vaultId = null;
	private Number height = null;

	public AuctionPaginationStart(String vaultid, Number height) {
		this.vaultId = vaultid;
		this.height = height;
	}
	
	public AuctionPaginationStart() {
		
	}

	public String getVaultId() {
		return vaultId;
	}

	public Number getHeight() {
		return height;
	}
	
	
	
}
