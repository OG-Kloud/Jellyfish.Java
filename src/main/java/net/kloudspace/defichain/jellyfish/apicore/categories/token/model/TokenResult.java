package net.kloudspace.defichain.jellyfish.apicore.categories.token.model;

import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TokenResult {
	
	private Map<String, TokenInfo> result;

	public void print() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(this));
	}
	
}
