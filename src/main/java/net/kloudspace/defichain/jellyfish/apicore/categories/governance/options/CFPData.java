package net.kloudspace.defichain.jellyfish.apicore.categories.governance.options;

import java.math.BigDecimal;

import net.kloudspace.defichain.jellyfish.Options;

public class CFPData extends Options {

	private final String title;
	private final BigDecimal amount;
	private final String payoutAddress;
	private final Number cycles;

	public CFPData(String title, BigDecimal amount, String payoutaddress, Number cycles) {
		this.title = title;
		this.amount = amount;
		this.payoutAddress = payoutaddress;
		this.cycles = cycles;
	}

	public String getTitle() {
		return title;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public String getPayoutAddress() {
		return payoutAddress;
	}

	public Number getCycles() {
		return cycles;
	}
	
	

}
