package net.kloudspace.defichain.jellyfish.model;

import java.math.BigDecimal;

public class Vout {

	private BigDecimal value;
	private Number n;
	private ScriptPubKey scriptPubKey;
	private String tokenId;

	public BigDecimal getValue() {
		return value;
	}

	public Number getN() {
		return n;
	}

	public ScriptPubKey getScriptPubKey() {
		return scriptPubKey;
	}

	public String getTokenId() {
		return tokenId;
	}

}
