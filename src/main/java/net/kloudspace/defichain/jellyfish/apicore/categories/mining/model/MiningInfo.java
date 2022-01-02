package net.kloudspace.defichain.jellyfish.apicore.categories.mining.model;

import java.math.BigDecimal;

public class MiningInfo {
	
	private Number blocks;
	private BigDecimal difficulty;
	private BigDecimal networkHashPS;
	private Number pooledTX;
	private String chain = "main";
	private boolean isOperator = false;
	/**
	 * TODO: implement
	 */
//	private Masternode[] masternodes;
	private String warnings = "";
	
	public MiningInfo(Number blocks, BigDecimal diff, BigDecimal nethash, Number pooltx) {
		this.blocks = blocks;
		this.difficulty = diff;
		this.networkHashPS = nethash;
		this.pooledTX = pooltx;
	}

	public Number getBlocks() {
		return blocks;
	}

	public void setBlocks(Number blocks) {
		this.blocks = blocks;
	}

	public BigDecimal getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(BigDecimal difficulty) {
		this.difficulty = difficulty;
	}

	public BigDecimal getNetworkHashPS() {
		return networkHashPS;
	}

	public void setNetworkHashPS(BigDecimal networkHashPS) {
		this.networkHashPS = networkHashPS;
	}

	public Number getPooledTX() {
		return pooledTX;
	}

	public void setPooledTX(Number pooledTX) {
		this.pooledTX = pooledTX;
	}

	public String getChain() {
		return chain;
	}

	public void setChain(String chain) {
		this.chain = chain;
	}

	public boolean isOperator() {
		return isOperator;
	}

	public void setOperator(boolean isOperator) {
		this.isOperator = isOperator;
	}

	public String getWarnings() {
		return warnings;
	}

	public void setWarnings(String warnings) {
		this.warnings = warnings;
	}
	
	

}
