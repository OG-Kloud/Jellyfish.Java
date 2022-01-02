package net.kloudspace.defichain.jellyfish.apicore.categories.account.model;

import java.math.BigDecimal;
import java.math.MathContext;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CommunityBalanceData {

	private BigDecimal AnchorReward = new BigDecimal("0.0", new MathContext(9));
	private BigDecimal IncentiveFunding = new BigDecimal("0.0", new MathContext(9));
	private BigDecimal Burnt = new BigDecimal("0.0", new MathContext(9));
	private BigDecimal Swap = new BigDecimal("0.0", new MathContext(9));
	private BigDecimal Futures = new BigDecimal("0.0", new MathContext(9));
	private BigDecimal Options = new BigDecimal("0.0", new MathContext(9));
	private BigDecimal Unallocated = new BigDecimal("0.0", new MathContext(9));
	private BigDecimal Unknown = new BigDecimal("0.0", new MathContext(9));
	
	public void print() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(this));
	}

	public BigDecimal getAnchorReward() {
		return AnchorReward;
	}

	public BigDecimal getIncentiveFunding() {
		return IncentiveFunding;
	}

	public BigDecimal getBurnt() {
		return Burnt;
	}

	public BigDecimal getSwap() {
		return Swap;
	}

	public BigDecimal getFutures() {
		return Futures;
	}

	public BigDecimal getOptions() {
		return Options;
	}

	public BigDecimal getUnallocated() {
		return Unallocated;
	}

	public BigDecimal getUnknown() {
		return Unknown;
	}

}
