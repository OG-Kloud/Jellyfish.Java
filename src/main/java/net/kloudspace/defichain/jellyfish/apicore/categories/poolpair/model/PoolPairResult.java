package net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.model;

import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PoolPairResult {
	
	private Map<String, PoolPairInfo> result;
	
	public void print() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(this));
	}

	public Map<String, PoolPairInfo> getResult() {
		return result;
	}
	
	

}
