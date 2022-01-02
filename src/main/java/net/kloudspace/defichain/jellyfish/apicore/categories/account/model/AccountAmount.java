package net.kloudspace.defichain.jellyfish.apicore.categories.account.model;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

public class AccountAmount {

	private String[] result;
	private Map<Integer, BigDecimal> balances = new HashMap<>();

	public AccountAmount(int arraysize) {
		result = new String[arraysize];
	}
	
	public void add(String key, String amount) {
		result[balances.keySet().size()] = amount+"@"+key;
		balances.put(Integer.parseInt(key), new BigDecimal(amount, new MathContext(9)));
	}

	public String[] getResult() {
		return result;
	}

	public void print() {
		for(String s : result)System.out.println(s);
	}
	

}
