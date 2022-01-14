package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.options;

import net.kloudspace.defichain.jellyfish.Options;

public class ListUnspentOptions extends Options {

	private String[] addresses;
	private boolean includeunsafe;
	private ListUnspentQueryOptions queryOptions;

	public String[] getAddresses() {
		return addresses;
	}

	public ListUnspentOptions setAddresses(String[] addresses) {
		this.addresses = addresses;
		return this;
	}

	public boolean isIncludeunsafe() {
		return includeunsafe;
	}

	public ListUnspentOptions setIncludeunsafe(boolean includeunsafe) {
		this.includeunsafe = includeunsafe;
		return this;
	}

	public ListUnspentQueryOptions getQueryOptions() {
		return queryOptions;
	}

	public ListUnspentOptions setQueryOptions(ListUnspentQueryOptions queryOptions) {
		this.queryOptions = queryOptions;
		return this;
	}

}
