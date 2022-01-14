package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model;

public enum BIP215 {

	YES("yes"), NO("no"), UNKNOWN("unknown");

	private final String ID;

	private BIP215(String id) {
		this.ID = id;
	}

	public String getID() {
		return ID;
	}

}
