package net.kloudspace.defichain.jellyfish.apicore.categories.account.options;

import net.kloudspace.defichain.jellyfish.Options;

public class BurnHistoryOptions extends Options {

	private Number maxBlockHeight;
	private Number depth;
	private String token;
	private DfTxType txtype;
	private Number limit;

	public Number getMaxBlockHeight() {
		return maxBlockHeight;
	}

	public BurnHistoryOptions setMaxBlockHeight(Number maxBlockHeight) {
		this.maxBlockHeight = maxBlockHeight;
		return this;
	}

	public Number getDepth() {
		return depth;
	}

	public BurnHistoryOptions setDepth(Number depth) {
		this.depth = depth;
		return this;
	}

	public String getToken() {
		return token;
	}

	public BurnHistoryOptions setToken(String token) {
		this.token = token;
		return this;
	}

	public DfTxType getTxtype() {
		return txtype;
	}

	public BurnHistoryOptions setTxtype(DfTxType txtype) {
		this.txtype = txtype;
		return this;
	}

	public Number getLimit() {
		return limit;
	}

	public BurnHistoryOptions setLimit(Number limit) {
		this.limit = limit;
		return this;
	}

}
