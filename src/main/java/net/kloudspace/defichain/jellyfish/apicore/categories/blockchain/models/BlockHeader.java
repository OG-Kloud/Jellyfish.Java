package net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BlockHeader {

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
	
	public void print() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(this));
	}

	public String getHash() {
		return hash;
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

}
