package net.kloudspace.defichain.jellyfish.apicore.categories.token.model;

import java.math.BigDecimal;

public class TokenInfo {

	private String symbol;
	private String symbolKey;
	private String name;
	private BigDecimal decimal;
	private Number limit;
	private boolean mintable;
	private boolean tradeable;
	private boolean isDAT;
	private boolean isLPS;
	private boolean isLoanToken;
	private boolean finalized;
	private BigDecimal minted;
	private String creationTx;
	private Number destructionHeight;
	private String collateralAddress;

	public String getSymbolKey() {
		return symbolKey;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getDecimal() {
		return decimal;
	}

	public Number getLimit() {
		return limit;
	}

	public boolean isDAT() {
		return isDAT;
	}

	public boolean isLPS() {
		return isLPS;
	}

	public boolean isLoanToken() {
		return isLoanToken;
	}

	public boolean isFinalized() {
		return finalized;
	}

	public BigDecimal getMinted() {
		return minted;
	}

	public String getCreationTx() {
		return creationTx;
	}

	public Number getDestructionHeight() {
		return destructionHeight;
	}

	private boolean isValidCollateral = false;

	public String getSymbol() {
		return symbol;
	}

	public String getCollateralAddress() {
		return collateralAddress;
	}

	public boolean isTradeable() {
		return tradeable;
	}

	public boolean isMintable() {
		return mintable;
	}

	public boolean isLps() {
		return isLPS;
	}

	public boolean isDat() {
		return isDAT;
	}

	public boolean isValidCollateral() {
		return isValidCollateral;
	}

}
