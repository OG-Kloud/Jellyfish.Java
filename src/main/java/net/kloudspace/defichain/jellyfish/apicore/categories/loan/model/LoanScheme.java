package net.kloudspace.defichain.jellyfish.apicore.categories.loan.model;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

public class LoanScheme {

	private String id;
	private BigDecimal mincolratio;
	private BigDecimal interestrate;
	@SerializedName("default")
	private boolean isDefault;

	public LoanScheme setId(String id) {
		this.id = id;
		return this;
	}

	public LoanScheme setMinCollateralratio(BigDecimal minCollateralratio) {
		this.mincolratio = minCollateralratio;
		return this;
	}

	public LoanScheme setInterestRate(BigDecimal interestRate) {
		this.interestrate = interestRate;
		return this;
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
		return mincolratio;
	}

	public BigDecimal getInterestRate() {
		return interestrate;
	}

}
