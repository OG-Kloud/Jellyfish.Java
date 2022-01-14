package net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.options;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import net.kloudspace.defichain.jellyfish.Options;

public class CreateRawTxOut extends Options {

	private Map<String, BigDecimal> outputs = new HashMap<>();

	public Map<String, BigDecimal> getOutputs() {
		return outputs;
	}

	public void addOutput(String address, BigDecimal amount) {
		this.outputs.put(address, amount);
	}

}
