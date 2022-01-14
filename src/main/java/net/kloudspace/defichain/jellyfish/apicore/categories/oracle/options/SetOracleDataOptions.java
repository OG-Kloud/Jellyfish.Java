package net.kloudspace.defichain.jellyfish.apicore.categories.oracle.options;

import java.util.ArrayList;
import java.util.List;

import net.kloudspace.defichain.jellyfish.Options;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.model.OraclePrice;

public class SetOracleDataOptions extends Options {
	
	private List<OraclePrice> prices = new ArrayList<>();
	
	public void addOraclePrice(String tokenamount, String currency) {
		prices.add(new OraclePrice().setTokenAmount(tokenamount).setCurrency(currency));
	}

}
