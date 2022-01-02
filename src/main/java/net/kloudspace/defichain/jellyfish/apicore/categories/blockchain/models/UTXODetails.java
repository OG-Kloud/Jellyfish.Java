package net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models;

import java.math.BigDecimal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class UTXODetails {

	private String bestblock;
	private Number confirmations;
	private BigDecimal value;
	private ScriptPubKey scriptPubKey;
	private boolean coinbase;
	
	public void print() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(this));
	}

	public String getBestblock() {
		return bestblock;
	}

	public Number getConfirmations() {
		return confirmations;
	}

	public BigDecimal getValue() {
		return value;
	}

	public ScriptPubKey getScriptPubKey() {
		return scriptPubKey;
	}

	public boolean isCoinbase() {
		return coinbase;
	}

}
