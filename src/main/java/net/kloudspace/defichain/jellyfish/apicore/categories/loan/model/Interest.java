package net.kloudspace.defichain.jellyfish.apicore.categories.loan.model;

import java.math.BigDecimal;

public class Interest {
	
	private final String token;
	private final BigDecimal totalInterest;
	private final BigDecimal interestPerBlock;
	
	public Interest(String token, BigDecimal total, BigDecimal perBlock) {
		this.token = token;
		this.totalInterest = total;
		this.interestPerBlock = perBlock;
	}

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
