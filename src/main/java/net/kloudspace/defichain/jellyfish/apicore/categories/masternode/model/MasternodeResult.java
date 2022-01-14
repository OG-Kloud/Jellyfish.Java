package net.kloudspace.defichain.jellyfish.apicore.categories.masternode.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class MasternodeResult<T> {
	
	private Map<String, T> masternodes = new HashMap<>();
	
	public Collection<T> getMasternodesSet() {
		return this.masternodes.values();
	}
	
	public T getMasternodeInfo(String key) {
		return this.masternodes.get(key);
	}
	
	public Collection<String> getMasternodeKeys() {
		return this.masternodes.keySet();
	}
	
	public void print() {
		System.out.println(new Gson().toJson(this));
	}

}
