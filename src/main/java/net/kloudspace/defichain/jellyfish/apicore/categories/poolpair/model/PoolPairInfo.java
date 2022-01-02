package net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.model;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

public class PoolPairInfo {

	private String symbol;
	private String name;
	private String idTokenA;
	private String idTokenB;
	private String ownerAddress;
	private String creationTx;
	private Number creationHeight;
	private BigDecimal reserveA;
	private BigDecimal reserveB;
	private BigDecimal totalLiquidity;
	private BigDecimal blockCommissionA;
	private BigDecimal blockCommissionB;
	private BigDecimal rewardPct;
	private boolean status;
	private boolean tradeEnabled;
	private String[] customRewards;
	@SerializedName("reserveA/reserveB")
	private BigDecimal ratioAtoB;
	@SerializedName("reserveB/reserveA")
	private BigDecimal ratioBtoA;

	public String getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}

	public String getIdTokenA() {
		return idTokenA;
	}

	public String getIdTokenB() {
		return idTokenB;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public String getCreationTx() {
		return creationTx;
	}

	public Number getCreationHeight() {
		return creationHeight;
	}

	public BigDecimal getReserveA() {
		return reserveA;
	}

	public BigDecimal getReserveB() {
		return reserveB;
	}

	public BigDecimal getTotalLiquidity() {
		return totalLiquidity;
	}

	public BigDecimal getBlockCommissionA() {
		return blockCommissionA;
	}

	public BigDecimal getBlockCommissionB() {
		return blockCommissionB;
	}

	public BigDecimal getRewardPct() {
		return rewardPct;
	}

	public boolean isStatus() {
		return status;
	}

	public boolean isTradeEnabled() {
		return tradeEnabled;
	}

	public String[] getCustomRewards() {
		return customRewards;
	}

	public BigDecimal getRatioAtoB() {
		return ratioAtoB;
	}

	public BigDecimal getRatioBtoA() {
		return ratioBtoA;
	}

}
