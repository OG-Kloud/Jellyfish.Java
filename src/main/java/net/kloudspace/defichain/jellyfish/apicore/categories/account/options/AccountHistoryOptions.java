package net.kloudspace.defichain.jellyfish.apicore.categories.account.options;

import net.kloudspace.defichain.jellyfish.Options;

public class AccountHistoryOptions extends Options {

	private Number maxBlockHeight = null;
	private Number depth = null;
	private boolean no_rewards = false;
	private String token = null;
	private DfTxType txtype = DfTxType.NONE;
	private Number limit = 100;

	public Number getMaxBlockHeight() {
		return maxBlockHeight;
	}

	public AccountHistoryOptions setMaxBlockHeight(Number maxBlockHeight) {
		this.maxBlockHeight = maxBlockHeight;
		return this;
	}

	public Number getDepth() {
		return depth;
	}

	public AccountHistoryOptions setDepth(Number depth) {
		this.depth = depth;
		return this;
	}

	public boolean isNo_rewards() {
		return no_rewards;
	}

	public AccountHistoryOptions setNo_rewards(boolean no_rewards) {
		this.no_rewards = no_rewards;
		return this;
	}

	public String getToken() {
		return token;
	}

	public AccountHistoryOptions setToken(String token) {
		this.token = token;
		return this;
	}

	public DfTxType getTxtype() {
		return txtype;
	}

	public AccountHistoryOptions setTxtype(DfTxType txtype) {
		this.txtype = txtype;
		return this;
	}

	public Number getLimit() {
		return limit;
	}

	public AccountHistoryOptions setLimit(Number limit) {
		this.limit = limit;
		return this;
	}

}
