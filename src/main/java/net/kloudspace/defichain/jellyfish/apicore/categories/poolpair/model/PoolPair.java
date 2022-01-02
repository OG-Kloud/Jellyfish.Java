package net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.model;

import java.math.BigDecimal;
import java.math.MathContext;

import net.kloudspace.defichain.jellyfish.apicore.categories.token.model.Token;

public class PoolPair {

	private final String symbol, name, owner_address, creation_tx;
	private final Token tokenA, TokenB;
	private final int id;
	private final Number creation_height;
	private BigDecimal reserveA = new BigDecimal(1), reserveB = new BigDecimal(1), commission, liquidity, reserveABRatio, reserveBARatio, reward_pct, reward_loan_pct;

	public PoolPair(int id, String sym, String name, String ownerAdd, String creationtx, Number creationHeight, Token a,
			Token b) {
		this.id = id;
		this.symbol = sym;
		this.name = name;
		this.owner_address = ownerAdd;
		this.creation_tx = creationtx;
		this.creation_height = creationHeight;
		this.tokenA = a;
		this.TokenB = b;
	}
	
	public void print() {
		System.out.println("\nPoolID: " + this.id + "\nPool Name: " + this.name + "\nAtoB: " + this.reserveABRatio + "\nBtoA: " + this.reserveBARatio);
	}

	public BigDecimal getReward_loan_pct() {
		return reward_loan_pct;
	}

	public void setReward_loan_pct(BigDecimal reward_loan_pct) {
		this.reward_loan_pct = reward_loan_pct;
	}

	public void setReservA(BigDecimal reserveA) {
		this.reserveA = reserveA;
		this.reserveABRatio = reserveA.divide(reserveB, new MathContext(9));
		this.reserveBARatio = reserveB.divide(reserveA, new MathContext(9));
	}

	public void setReserveB(BigDecimal reserveB) {
		this.reserveB = reserveB;
		this.reserveABRatio = reserveA.divide(reserveB, new MathContext(9));
		this.reserveBARatio = reserveB.divide(reserveA, new MathContext(9));
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public void setLiquidity(BigDecimal liquidity) {
		this.liquidity = liquidity;
	}

	public void setReward_pct(BigDecimal reward_pct) {
		this.reward_pct = reward_pct;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}

	public String getOwner_address() {
		return owner_address;
	}

	public String getCreation_tx() {
		return creation_tx;
	}

	public Token getTokenA() {
		return tokenA;
	}

	public Token getTokenB() {
		return TokenB;
	}

	public int getId() {
		return id;
	}

	public Number getCreation_height() {
		return creation_height;
	}

	public BigDecimal getReservA() {
		return reserveA;
	}

	public BigDecimal getReserveB() {
		return reserveB;
	}

	public BigDecimal getCommission() {
		return commission;
	}

	public BigDecimal getLiquidity() {
		return liquidity;
	}

	public BigDecimal getReserveAB() {
		return reserveABRatio;
	}

	public BigDecimal getReserveBA() {
		return reserveBARatio;
	}

	public BigDecimal getReward_pct() {
		return reward_pct;
	}

}
