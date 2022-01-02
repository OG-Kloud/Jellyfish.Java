package net.kloudspace.defichain.jellyfish.apicore.categories.token.model;

import java.math.BigDecimal;
import java.math.MathContext;

import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.CollateralTokenDetail;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.LoanTokenDetail;
import net.kloudspace.defichain.jellyfish.apicore.categories.token.TokenController;

public class Token {
	
	private final int id;
	private final String symbol, collateralAddress;
	private boolean isTradeable, isMintable, isLps, isDat, isLoanable;
	private boolean isValidCollateral = false;
	private BigDecimal dexPrice = new BigDecimal(0, new MathContext(9));
	private CollateralTokenDetail collateraldetail;
	private LoanTokenDetail loandetail;
	
	public Token(int id, String sym, String collateralHeld) {
		this.id = id;
		this.symbol = sym;
		this.collateralAddress = collateralHeld;
		
	}
	
	public void makeTradeable() {this.isTradeable = true;}
	public void makeMinatble() {this.isMintable = true;}
	public void makeLoanable() {this.isLoanable = true;}
	public void setAsLPS() {this.isLps = true;}
	public void setAsDAT() {this.isDat = true;}
	public void makeValidCollateral() {this.isValidCollateral = true;}
	
	public void print() {
		System.out.println("\nID: " + this.id + "\nSymbol: " +this.symbol + "\nIs Mintable: " + this.isMintable + "\nIs Tradeable: " + this.isTradeable + "\nIs Loanable: " + this.isLoanable
				+ "\nIs DAT: " + this.isDat + "\nIs LPS: " + this.isLps);
	}
	
	public LoanTokenDetail getLoandetail() {
		return loandetail;
	}

	public void setLoandetail(LoanTokenDetail loandetail) {
		this.loandetail = loandetail;
	}

	public CollateralTokenDetail getCollateraldetail() {
		return collateraldetail;
	}

	public void setCollateraldetail(CollateralTokenDetail collateraldetail) {
		this.collateraldetail = collateraldetail;
	}

	public void setDexPrice(BigDecimal price) {
		this.dexPrice = price;
		System.out.println("Set dex price: " + this.symbol + "Dex Price: " + this.dexPrice);
	}
	public BigDecimal getDexPrice() {return this.dexPrice;}

	public int getId() {
		return id;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getCollateralAddress() {
		return collateralAddress;
	}

	public boolean isTradeable() {
		return isTradeable;
	}

	public boolean isMintable() {
		return isMintable;
	}

	public boolean isLps() {
		return isLps;
	}

	public boolean isDat() {
		return isDat;
	}

	public boolean isLoanable() {
		return isLoanable;
	}
	
	public boolean isValidCollateral() {
		return this.isValidCollateral;
	}
	
	public void init(TokenController controller) {
		
	}
	
	

}
