package net.kloudspace.defichain.jellyfish.apicore.categories.token.options;

import net.kloudspace.defichain.jellyfish.Options;

public class CreateTokenOptions extends Options {
	
	private final String symbol;
	private final String name;
	private final boolean isDAT;
	private final boolean mintable;
	private final boolean tradeable;
	private final String collateralAddress;
	
	public CreateTokenOptions(String symbol, String name, boolean isdat, boolean mintable, boolean tradeable, String collateralAddreass) {
		this.symbol = symbol;
		this.name = name;
		this.isDAT = isdat;
		this.mintable = mintable;
		this.tradeable = tradeable;
		this.collateralAddress = collateralAddreass;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}

	public boolean isDAT() {
		return isDAT;
	}

	public boolean isMintable() {
		return mintable;
	}

	public boolean isTradeable() {
		return tradeable;
	}

	public String getCollateralAddress() {
		return collateralAddress;
	}
	
	

}
