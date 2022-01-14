package net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.options;

import net.kloudspace.defichain.jellyfish.Options;

public class CreateRawTxOptions extends Options {
	
	private Number locktime = 0;
	private boolean replaceable = false;
	
	public Number getLocktime() {
		return locktime;
	}
	public CreateRawTxOptions setLocktime(Number locktime) {
		this.locktime = locktime;
		return this;
	}
	public boolean isReplaceable() {
		return replaceable;
	}
	public CreateRawTxOptions setReplaceable(boolean replaceable) {
		this.replaceable = replaceable;
		return this;
	}
	
	

}
