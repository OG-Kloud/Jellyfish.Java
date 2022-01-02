package net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.options;

import java.util.HashMap;
import java.util.Map;

import net.kloudspace.defichain.jellyfish.Options;

public class AddPoolLiquiditySourceOptions extends Options {
	
	private final Map<String, String[]> from;
	
	public AddPoolLiquiditySourceOptions(String address, String[] tokens) {
		from = new HashMap<>();
		from.put(address, tokens);
	}

}
