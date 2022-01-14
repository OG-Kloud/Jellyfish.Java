package net.kloudspace.defichain.jellyfish.apicore.categories.masternode.model;

import com.google.gson.GsonBuilder;

public class MasternodeAnchor {

	private Number anchorHeight;
	private String anchorHash;
	private String rewardAddress;
	private String dfiRewardHash;
	private Number btcAnchorHeight;
	private String btcAnchorHash;
	private String confirmSignHash;
	
	public void print() {
		System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(this));
	}

	public Number getAnchorHeight() {
		return anchorHeight;
	}

	public String getAnchorHash() {
		return anchorHash;
	}

	public String getRewardAddress() {
		return rewardAddress;
	}

	public String getDfiRewardHash() {
		return dfiRewardHash;
	}

	public Number getBtcAnchorHeight() {
		return btcAnchorHeight;
	}

	public String getBtcAnchorHash() {
		return btcAnchorHash;
	}

	public String getConfirmSignHash() {
		return confirmSignHash;
	}

}
