package net.kloudspace.defichain.jellyfish.apicore.categories.token.options;

import net.kloudspace.defichain.jellyfish.Options;

public class UpdateTokenOptions extends Options {

	private final String symbol;
	private final String name;
	private final boolean isDAT;
	private final boolean mintable;
	private final boolean tradeable;
	private final boolean finalize;
	
	public UpdateTokenOptions(String sym, String name, boolean isDat, boolean mintable, boolean tradeable, boolean finalized) {
		this.symbol = sym;
		this.name = name;
		this.isDAT = isDat;
		this.mintable = mintable;
		this.tradeable = tradeable;
		this.finalize = finalized;
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

	public boolean isFinalize() {
		return finalize;
	}

}
