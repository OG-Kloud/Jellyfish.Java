package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.options;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import net.kloudspace.defichain.jellyfish.Options;

public class Record extends Options {
	
	private final Map<String, BigDecimal> amounts;
	
	public Record() {
		amounts = new HashMap<>();
	}
	
	public Record addEntry(String address, BigDecimal amount) {
		amounts.put(address, amount);
		return this;
	}
	
}
