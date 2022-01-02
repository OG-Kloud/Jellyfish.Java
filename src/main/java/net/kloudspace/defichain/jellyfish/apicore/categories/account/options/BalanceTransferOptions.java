package net.kloudspace.defichain.jellyfish.apicore.categories.account.options;

import java.math.BigDecimal;

import net.kloudspace.defichain.jellyfish.apicore.categories.token.model.Token;

public class BalanceTransferOptions {
	
	private final String address;
	private final String amount;
	
	public BalanceTransferOptions(String address, String amount) {
		this.address = address;
		this.amount = amount;
	}
	
	public BalanceTransferOptions(String address, Token token, BigDecimal amount) {
		this(address, amount.toPlainString()+"@"+token.getSymbol());
	}

	public String getAddress() {
		return address;
	}

	public String getAmount() {
		return amount;
	}
	
	

}
