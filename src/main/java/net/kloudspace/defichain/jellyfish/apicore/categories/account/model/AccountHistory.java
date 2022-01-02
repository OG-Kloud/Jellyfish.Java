package net.kloudspace.defichain.jellyfish.apicore.categories.account.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class AccountHistory {

	private String owner;
	private Number blockHeight;
	private String blockHash;
	private Number blockTime;
	private String type;
	private String rewardType;
	private Number poolID;
	private String[] amounts;
	
	public void print() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(this));
	}

	public String getOwner() {
		return owner;
	}

	public Number getBlockHeight() {
		return blockHeight;
	}

	public String getBlockHash() {
		return blockHash;
	}

	public Number getBlockTime() {
		return blockTime;
	}

	public String getType() {
		return type;
	}

	public String getRewardType() {
		return rewardType;
	}

	public Number getPoolID() {
		return poolID;
	}

	public String[] getAmounts() {
		return amounts;
	}

}
