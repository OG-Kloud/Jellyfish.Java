package net.kloudspace.defichain.jellyfish.apicore.categories.account.model;

public class AccountResult<T extends AccountOwner, U extends AccountAmount> {

	private String key;
	private T owner;
	private U BALANCE;

	public String getKey() {
		return key;
	}

	public T getOwner() {
		return owner;
	}

	public U getBALANCE() {
		return BALANCE;
	}

}
