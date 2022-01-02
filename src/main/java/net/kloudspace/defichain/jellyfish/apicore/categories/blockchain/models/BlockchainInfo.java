package net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models;

import java.math.BigDecimal;
import java.util.Map;

public class BlockchainInfo {

	private String chain;
	private Number blocks;
	private Number headers;
	private String bestBlockHash;
	private BigDecimal difficuly;
	private Number meanTime;
	private BigDecimal verificationProgress;
	boolean initialBlockDownload;
	private String chainwork;
	private Number sizeOnDisk;
	private boolean pruned;
	private Map<String, SoftFork> softforks;

	public BlockchainInfo(String chain, Number blocks) {
		this.chain = chain;
		this.blocks = blocks;
	}
	
	

	public String getChain() {
		return chain;
	}



	public Number getBlocks() {
		return blocks;
	}



	public Number getHeaders() {
		return headers;
	}



	public String getBestBlockHash() {
		return bestBlockHash;
	}



	public BigDecimal getDifficuly() {
		return difficuly;
	}



	public Number getMeanTime() {
		return meanTime;
	}



	public BigDecimal getVerificationProgress() {
		return verificationProgress;
	}



	public boolean isInitialBlockDownload() {
		return initialBlockDownload;
	}



	public String getChainwork() {
		return chainwork;
	}



	public Number getSizeOnDisk() {
		return sizeOnDisk;
	}



	public boolean isPruned() {
		return pruned;
	}



	public Map<String, SoftFork> getSoftforks() {
		return softforks;
	}



	public void print() {
		System.out.println("\nBlockchainInfo: \nNetwork: " + this.chain + "\nNumber of Blocks: " + this.blocks + "\n");
	}

}
