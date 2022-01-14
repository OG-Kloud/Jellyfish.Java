package net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.model;

import java.util.List;

public class SignRawTxWithKeyResult {

	private String hex;
	private boolean complete;
	private List<SignRawTxWithKeyError> errors;

	public String getHex() {
		return hex;
	}

	public boolean isComplete() {
		return complete;
	}

	public List<SignRawTxWithKeyError> getErrors() {
		return errors;
	}

}
