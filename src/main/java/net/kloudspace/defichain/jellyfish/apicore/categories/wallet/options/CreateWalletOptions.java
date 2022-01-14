package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.options;

import net.kloudspace.defichain.jellyfish.Options;

public class CreateWalletOptions extends Options {

	private boolean blank;
	private String passphrase;
	private boolean avoidreuse;

	public boolean isBlank() {
		return blank;
	}

	public CreateWalletOptions setBlank(boolean blank) {
		this.blank = blank;
		return this;
	}

	public String getPassphrase() {
		return passphrase;
	}

	public CreateWalletOptions setPassphrase(String passphrase) {
		this.passphrase = passphrase;
		return this;
	}

	public boolean isAvoidreuse() {
		return avoidreuse;
	}

	public CreateWalletOptions setAvoidreuse(boolean avoidreuse) {
		this.avoidreuse = avoidreuse;
		return this;
	}

}
