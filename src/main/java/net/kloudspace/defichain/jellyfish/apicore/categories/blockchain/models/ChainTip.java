package net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ChainTip {

	private String hash;
	private String status;
	private Number height;
	private Number branchlen;
	
	public void print() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(this));
	}

	public String getHash() {
		return hash;
	}

	public String getStatus() {
		return status;
	}

	public Number getHeight() {
		return height;
	}

	public Number getBranchlen() {
		return branchlen;
	}

}
