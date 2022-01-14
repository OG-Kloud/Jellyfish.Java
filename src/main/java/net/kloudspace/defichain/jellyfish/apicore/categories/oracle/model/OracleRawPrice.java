package net.kloudspace.defichain.jellyfish.apicore.categories.oracle.model;

import java.math.BigDecimal;

import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.options.OraclePriceFeed;

public class OracleRawPrice {

	private String oracleId;
	private OraclePriceFeed priceFeeds;
	private BigDecimal rawprice;
	private BigDecimal weightage;
	private String state;
	private Number timestamp;

	public String getOracleId() {
		return oracleId;
	}

	public OraclePriceFeed getPriceFeeds() {
		return priceFeeds;
	}

	public BigDecimal getRawprice() {
		return rawprice;
	}

	public BigDecimal getWeightage() {
		return weightage;
	}

	public String getState() {
		return state;
	}

	public Number getTimestamp() {
		return timestamp;
	}

}
