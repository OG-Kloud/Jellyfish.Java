package net.kloudspace.defichain.jellyfish.apicore.categories.loan.options;

public class ListCollateralTokenOptions {
	
	private final Number height;
	private final boolean all;
	
	public ListCollateralTokenOptions(Number height, boolean all) {
		this.all = all;
		this.height = height;
	}

	public Number getHeight() {
		return height;
	}

	public boolean isAll() {
		return all;
	}
	
	

}
