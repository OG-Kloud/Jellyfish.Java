package net.kloudspace.defichain.jellyfish.apicore.categories.loan.model;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;

public class VaultActive extends Vault {
	
	private List<String> collateralAmounts;
	private List<String> loanAmounts;
	private List<String> interestAmounts;
	private BigDecimal collateralValue;
	private BigDecimal loanValue;
	private BigDecimal interestValue;
	private BigDecimal informativeRatio;
	private BigDecimal collateralRatio;
	
	@Override
	public void print() {
		System.out.println("\nVault:\nVault ID: " + this.vaultId + "\nCollateral Value: " + this.collateralValue
				+ "\nLoan Amount: " + this.loanValue + "\nCollateral Ratio: " + this.informativeRatio + "\n");
	}
	
	public BigDecimal getCollateralAmount(String tokenSym) {
		for(String s : collateralAmounts)
			if(s.split("@")[1].equals(tokenSym))return new BigDecimal(s.split("@")[0], new MathContext(9));
		return new BigDecimal("0.0", new MathContext(9));
	}
	
	public BigDecimal getLoanAmount(String tokenSym) {
		for(String s : loanAmounts)
			if(s.split("@")[1].equals(tokenSym))return new BigDecimal(s.split("@")[0], new MathContext(9));
		return new BigDecimal("0.0", new MathContext(9));
	}
	
	public BigDecimal getInterestAmount(String tokenSym) {
		for(String s : interestAmounts)
			if(s.split("@")[1].equals(tokenSym))return new BigDecimal(s.split("@")[0], new MathContext(9));
		return new BigDecimal("0.0", new MathContext(9));
	}
	public BigDecimal getCollateralValue() {
		return collateralValue;
	}

	public BigDecimal getLoanValue() {
		return loanValue;
	}

	public BigDecimal getInterestValue() {
		return interestValue;
	}

	public BigDecimal getInformativeRatio() {
		return informativeRatio;
	}

	public BigDecimal getCollateralRatio() {
		return collateralRatio;
	}

}
