package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model;

public class WalletBalances {

	private WalletMineBalances mine;
	private WalletWatchOnlyBalances watchonly;

	public WalletMineBalances getMine() {
		return mine;
	}

	public WalletWatchOnlyBalances getWatchonly() {
		return watchonly;
	}

}
