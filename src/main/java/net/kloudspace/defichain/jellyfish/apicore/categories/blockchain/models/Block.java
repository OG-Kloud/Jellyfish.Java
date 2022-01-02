package net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import net.kloudspace.defichain.jellyfish.apicore.categories.account.model.CommunityBalanceData;

public class Block {

	private String hash;//
	private String versionHex;//
	private String merkleroot;//
	private String chainwork;//
	private String previousblockhash;//
	private String nextblockhash;//
	private String bits;//
	private Number confirmations;//
	private Number height;//
	private Number mintedBlocks;
	private Number version;//
	private Number time;//
	private Number mediantime;//
	private Number difficulty;//
	private Number nTx;//
	private Number weight;
	private Number size;
	private String masternode;
	private Number strippedsize;
	private String minter;
	private String stakeModifier;
	private CommunityBalanceData[] nonutxo;
	private Transaction[] tx;
	
	public void print() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(this));
	}

	public String getHash() {
		return hash;
	}

	public String getMasternode() {
		return masternode;
	}

	public String getMinter() {
		return minter;
	}

	public String getStakeModifier() {
		return stakeModifier;
	}

	public String getVersionHex() {
		return versionHex;
	}

	public String getMerkleroot() {
		return merkleroot;
	}

	public String getChainwork() {
		return chainwork;
	}

	public String getPreviousblockhash() {
		return previousblockhash;
	}

	public String getNextblockhash() {
		return nextblockhash;
	}

	public String getBits() {
		return bits;
	}

	public Number getConfirmations() {
		return confirmations;
	}

	public Number getStrippedsize() {
		return strippedsize;
	}

	public Number getSize() {
		return size;
	}

	public Number getWeight() {
		return weight;
	}

	public Number getHeight() {
		return height;
	}

	public Number getMintedBlocks() {
		return mintedBlocks;
	}

	public Number getVersion() {
		return version;
	}

	public Number getTime() {
		return time;
	}

	public Number getMediantime() {
		return mediantime;
	}

	public Number getDifficulty() {
		return difficulty;
	}

	public Number getnTx() {
		return nTx;
	}

	public CommunityBalanceData[] getNonUtxo() {
		return nonutxo;
	}

}
