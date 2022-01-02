package net.kloudspace.defichain.jellyfish.apicore.categories.loan.model;

import java.math.BigDecimal;

public class LoanInfo {

	private int currentpriceblock, nextpriceblock;

	private String defaultschemeid;
	private BigDecimal defaultmaxpricedeviation;
	private int defaultminoraclesperprice;
	private int defaultfixedintervalblocks;

	private int totalschemes;
	private int totalacceptablecollateraltokens;
	private int totalavalableloantokens;
	private int totalopenvaults;
	private int totalopenauctions;
	private BigDecimal totalcollateralvalue;
	private BigDecimal totalloanvalues;

	public LoanInfo(int currentblock, int nextblock, String schemeid, BigDecimal maxdeviation, int minoracles, int defaultfixedinterval,
			int totalschemes, int totalacceptedcollaterals, BigDecimal totalcollateral, int avalibleloantokens,  BigDecimal totalloans, int openvaults, int openauctions) {
		this.currentpriceblock = currentblock;
		this.nextpriceblock = nextblock;
		this.defaultschemeid = schemeid;
		this.defaultmaxpricedeviation = maxdeviation;
		this.defaultminoraclesperprice = minoracles;
		this.defaultfixedintervalblocks = defaultfixedinterval;
		this.totalschemes = totalschemes;
		this.totalacceptablecollateraltokens = totalacceptedcollaterals;
		this.totalavalableloantokens = avalibleloantokens;
		this.totalopenvaults = openvaults;
		this.totalopenauctions = openauctions;
		this.totalcollateralvalue = totalcollateral;
		this.totalloanvalues = totalloans;
	}

	public int getCurrentpriceblock() {
		return currentpriceblock;
	}

	public int getNextpriceblock() {
		return nextpriceblock;
	}

	public String getDefaultschemeid() {
		return defaultschemeid;
	}

	public BigDecimal getDefaultmaxpricedeviation() {
		return defaultmaxpricedeviation;
	}

	public int getDefaultminoraclesperprice() {
		return defaultminoraclesperprice;
	}

	public int getDefaultfixedintervalblocks() {
		return defaultfixedintervalblocks;
	}

	public int getTotalschemes() {
		return totalschemes;
	}

	public int getTotalacceptablecollateraltokens() {
		return totalacceptablecollateraltokens;
	}

	public int getTotalavalableloantokens() {
		return totalavalableloantokens;
	}

	public int getTotalopenvaults() {
		return totalopenvaults;
	}

	public int getTotalopenauctions() {
		return totalopenauctions;
	}

	public BigDecimal getTotalcollateralvalue() {
		return totalcollateralvalue;
	}

	public BigDecimal getTotalloanvalues() {
		return totalloanvalues;
	}

}
