package net.kloudspace.defichain.jellyfish.apicore.categories.account.model;

import java.util.HashMap;
import java.util.Map;

public class BurnInfo {
	
	private final String ADDRESS = "8defichainBurnAddressXXXXXXXdRQkSm";
	private Number AMOUNT, FEEBURN, EMISSIONBURN;
	private Map<String, Number> TOKENSSENTTOBURN;
	


	public BurnInfo() {
		this.TOKENSSENTTOBURN = new HashMap<String, Number>();
	}
	
	
	
	public void setAMOUNT(Number aMOUNT) {
		AMOUNT = aMOUNT;
	}



	public void setFEEBURN(Number fEEBURN) {
		FEEBURN = fEEBURN;
	}



	public void setEMISSIONBURN(Number eMISSIONBURN) {
		EMISSIONBURN = eMISSIONBURN;
	}


	public void addTokenSent(String id, Number amount) {
		this.TOKENSSENTTOBURN.put(id, amount);
	}

	
	public void print() {
		System.out.println("\nAddress: " + this.ADDRESS + "\nAmount: " +this.AMOUNT + "\nFeeBurn: " + this.FEEBURN+ "\nEmission: " + this.EMISSIONBURN + "\n");
	}
	
	
	

}
