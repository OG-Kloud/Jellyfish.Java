package net.kloudspace.defichain.jellyfish.apicore.categories.loan.model;

import java.math.BigDecimal;

public class LoanTokenDetail {
	
	private final String fixedintervalpriceid;
	private final BigDecimal interest;
	
	public LoanTokenDetail(String priceid, BigDecimal interest) {
		this.fixedintervalpriceid = priceid;
		this.interest = interest;
	}

	public String getFixedintervalpriceid() {
		return fixedintervalpriceid;
	}

	public BigDecimal getInterest() {
		return interest;
	}
	
	
	
	

}
