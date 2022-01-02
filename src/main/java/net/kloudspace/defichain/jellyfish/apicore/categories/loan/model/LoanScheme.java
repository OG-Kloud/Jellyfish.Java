package net.kloudspace.defichain.jellyfish.apicore.categories.loan.model;

import java.math.BigDecimal;

public class LoanScheme {
	
	private final String id;
	private final BigDecimal minCollateralratio;
	private final BigDecimal interestRate;
	private boolean isDefault = false;
	
	public LoanScheme(String id, BigDecimal mincolratio, BigDecimal interestrate) {
		this.id = id;
		this.minCollateralratio = mincolratio;
		this.interestRate = interestrate;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public LoanScheme setDefault(boolean isDefault) {
		this.isDefault = isDefault;
		return this;
	}

	public String getId() {
		return id;
	}

	public BigDecimal getMinCollateralratio() {
		return minCollateralratio;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}
	
	

}
