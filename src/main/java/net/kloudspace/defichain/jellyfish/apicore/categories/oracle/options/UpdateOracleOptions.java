package net.kloudspace.defichain.jellyfish.apicore.categories.oracle.options;

import net.kloudspace.defichain.jellyfish.Options;

public class UpdateOracleOptions extends Options{

	private OraclePriceFeedOption priceFeeds;
	private Number weightage;

	public OraclePriceFeedOption getPriceFeeds() {
		return priceFeeds;
	}

	public UpdateOracleOptions setPriceFeeds(OraclePriceFeedOption priceFeeds) {
		this.priceFeeds = priceFeeds;
		return this;
	}

	public Number getWeightage() {
		return weightage;
	}

	public UpdateOracleOptions setWeightage(Number weightage) {
		this.weightage = weightage;
		return this;
	}

}
