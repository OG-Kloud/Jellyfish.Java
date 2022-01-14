package net.kloudspace.defichain.jellyfish.apicore.categories.loan.model;

import java.math.BigDecimal;

public class Interest {
	
	private String token;
	private BigDecimal totalInterest;
	private BigDecimal interestPerBlock;

	public String getToken() {
		return token;
	}

	public BigDecimal getTotalInterest() {
		return totalInterest;
	}

	public BigDecimal getInterestPerBlock() {
		return interestPerBlock;
	}
	
	

}
