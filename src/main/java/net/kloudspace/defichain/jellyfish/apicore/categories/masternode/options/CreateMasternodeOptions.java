package net.kloudspace.defichain.jellyfish.apicore.categories.masternode.options;

import com.google.gson.Gson;

import net.kloudspace.defichain.jellyfish.Options;
import net.kloudspace.defichain.jellyfish.model.UTXO;

public class CreateMasternodeOptions extends Options {

	private UTXO[] utxos;
	private MasternodeTimeLock timelock;

	public UTXO[] getUtxos() {
		return utxos;
	}

	public CreateMasternodeOptions setUtxos(UTXO[] utxos) {
		this.utxos = utxos;
		return this;
	}

	public MasternodeTimeLock getTimelock() {
		return timelock;
	}

	public CreateMasternodeOptions setTimelock(MasternodeTimeLock timelock) {
		this.timelock = timelock;
		return this;
	}

	@Override
	public String getAsParameter() {
		return "[" + new Gson().toJson(utxos) + ",\"" + this.timelock.getID() + "\"]";
	}

}
