package net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.options;

import java.util.ArrayList;
import java.util.List;

import net.kloudspace.defichain.jellyfish.Options;

public class SignRawTxWithKeyOptions extends Options {

	private List<SignRawTxWithKeyPrevTx> prevTxs = new ArrayList<>();
	private SigHashType sigHashType;

	public List<SignRawTxWithKeyPrevTx> getPrevTxs() {
		return prevTxs;
	}

	public SigHashType getSigHashType() {
		return sigHashType;
	}

	public SignRawTxWithKeyOptions addprevTX(SignRawTxWithKeyPrevTx ptx) {
		this.prevTxs.add(ptx);
		return this;
	}

}
