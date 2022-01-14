package net.kloudspace.defichain.jellyfish.apicore.categories.mining.model;

import java.math.BigDecimal;

import net.kloudspace.defichain.jellyfish.apicore.categories.masternode.model.MasternodeInfo;

public class MiningInfo {

	private Number blocks;
	private BigDecimal difficulty;
	private BigDecimal networkHashPS;
	private Number pooledTX;
	private String chain = "main";
	private boolean isOperator = false;
	private MasternodeInfo[] masternodes;
	private String warnings = "";

	public Number getBlocks() {
		return blocks;
	}

	public BigDecimal getDifficulty() {
		return difficulty;
	}

	public BigDecimal getNetworkHashPS() {
		return networkHashPS;
	}

	public Number getPooledTX() {
		return pooledTX;
	}

	public String getChain() {
		return chain;
	}

	public boolean isOperator() {
		return isOperator;
	}

	public MasternodeInfo[] getMasternodes() {
		return masternodes;
	}

	public String getWarnings() {
		return warnings;
	}

}
