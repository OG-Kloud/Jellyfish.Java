package net.kloudspace.defichain.jellyfish.apicore.categories.oracle.options;

import net.kloudspace.defichain.jellyfish.Options;
import net.kloudspace.defichain.jellyfish.model.UTXO;

public class AppointOracleOptions extends Options {

	private Number weightage;
	private UTXO[] utxos;

	public Number getWeightage() {
		return weightage;
	}

	public AppointOracleOptions setWeightage(Number weightage) {
		this.weightage = weightage;
		return this;
	}

	public UTXO[] getUtxos() {
		return utxos;
	}

	public AppointOracleOptions setUtxos(UTXO[] utxos) {
		this.utxos = utxos;
		return this;
	}

}
