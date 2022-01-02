package net.kloudspace.defichain.jellyfish.apicore.categories.loan.options;

import java.math.BigDecimal;

public class CreateLoanSchemeOptions {
	
	private final BigDecimal minColRatio;
	private final BigDecimal interestRate;
	private final String id;
	
	public CreateLoanSchemeOptions(BigDecimal mincollateralratio, BigDecimal interestrate, String id) {
		this.minColRatio = mincollateralratio;
		this.interestRate = interestrate;
		this.id = id;
	}

	public BigDecimal getMinColRatio() {
		return minColRatio;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public String getId() {
		return id;
	}
	
	
}
