package net.kloudspace.defichain.jellyfish.apicore.categories.masternode.options;

public enum MasternodeTimeLock {
	
	FIVE_YEAR("FIVEYEARTIMELOCK"), TEN_YEAR("TENYEARTIMELOCK");
	
	private final String ID;
	
	private MasternodeTimeLock(String id) {
		this.ID = id;
	}
	
	public String getID() {
		return ID;
	}

}
