package net.kloudspace.defichain.jellyfish.apicore.categories.oracle.model;

import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.options.OraclePriceFeed;

public class OracleData {

	private String oracleId;
	private String address;
	private OraclePriceFeed[] priceFeeds;
	private OracleTokenPrice[] tokenPrices;
	private Number weightage;

	public String getOracleId() {
		return oracleId;
	}

	public String getAddress() {
		return address;
	}

	public OraclePriceFeed[] getPriceFeeds() {
		return priceFeeds;
	}

	public OracleTokenPrice[] getTokenPrices() {
		return tokenPrices;
	}

	public Number getWeightage() {
		return weightage;
	}

}
