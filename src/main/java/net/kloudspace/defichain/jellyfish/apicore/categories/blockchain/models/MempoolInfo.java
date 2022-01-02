package net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models;

import java.math.BigDecimal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MempoolInfo {

	private boolean loaded;
	private Number size;
	private Number bytes;
	private Number useage;
	private Number maxmempool;
	private BigDecimal mempoolminfee;
	private BigDecimal minrelaytxfee;
	
	public void print() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(this));
	}

	public boolean isLoaded() {
		return loaded;
	}

	public Number getSize() {
		return size;
	}

	public Number getBytes() {
		return bytes;
	}

	public Number getUseage() {
		return useage;
	}

	public Number getMaxmempool() {
		return maxmempool;
	}

	public BigDecimal getMempoolminfee() {
		return mempoolminfee;
	}

	public BigDecimal getMinrelaytxfee() {
		return minrelaytxfee;
	}

}
