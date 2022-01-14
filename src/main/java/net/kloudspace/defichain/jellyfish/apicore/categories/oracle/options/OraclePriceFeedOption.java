package net.kloudspace.defichain.jellyfish.apicore.categories.oracle.options;

import java.util.ArrayList;
import java.util.List;

import net.kloudspace.defichain.jellyfish.Options;

public class OraclePriceFeedOption extends Options {

	private List<OraclePriceFeed> priceFeeds = new ArrayList<>();

	public OraclePriceFeedOption addFeed(String token, String currency) {
		this.priceFeeds.add(new OraclePriceFeed().setToken(token).setCurrency(currency));
		return this;
	}

}
