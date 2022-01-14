package net.kloudspace.defichain.jellyfish.apicore.categories.masternode.options;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

import net.kloudspace.defichain.jellyfish.Options;

public class Flag<T> extends Options {

	private static final MathContext precision = new MathContext(9);

	public static final Flag<BigDecimal> ICX_TAKERFEE_PER_BTC = new Flag<>("ICX_TAKERFEE_PER_BTC",
			new BigDecimal("0.003", precision));
	public static final Flag<BigDecimal> LP_DAILY_LOAN_TOKEN_REWARD = new Flag<>("LP_DAILY_LOAN_TOKEN_REWARD",
			new BigDecimal("213077.80402560", precision));
	public static final Flag<Map<Integer, BigDecimal>> LP_LOAN_TOKEN_SPLITS = new Flag<>("LP_LOAN_TOKEN_SPLITS",
			new HashMap<>());
	public static final Flag<BigDecimal> LP_DAILY_DFI_REWARD = new Flag<>("LP_DAILY_DFI_REWARD",
			new BigDecimal("219725.69336640", precision));
	public static final Flag<BigDecimal> LOAN_LIQUIDATION_PENALTY = new Flag<>("LOAN_LIQUIDATION_PENALTY",
			new BigDecimal("0", precision));
	public static final Flag<Map<Integer, BigDecimal>> LP_SPLITS = new Flag<>("LP_SPLITS", new HashMap<>());
	public static final Flag<BigDecimal> ORACLE_BLOCK_INTERVAL = new Flag<>("ORACLE_BLOCK_INTERVAL",
			new BigDecimal("0", precision));
	public static final Flag<BigDecimal> ORACLE_DEVIATION = new Flag<>("ORACLE_DEVIATION",
			new BigDecimal("0", precision));

	static {
		LP_LOAN_TOKEN_SPLITS.value.put(17, new BigDecimal("0.5", precision));
		LP_LOAN_TOKEN_SPLITS.value.put(18, new BigDecimal("0.1098", precision));
		LP_LOAN_TOKEN_SPLITS.value.put(25, new BigDecimal("0.0499", precision));
		LP_LOAN_TOKEN_SPLITS.value.put(32, new BigDecimal("0.0239", precision));
		LP_LOAN_TOKEN_SPLITS.value.put(33, new BigDecimal("0.0335", precision));
		LP_LOAN_TOKEN_SPLITS.value.put(35, new BigDecimal("0.0263", precision));
		LP_LOAN_TOKEN_SPLITS.value.put(36, new BigDecimal("0.0378", precision));
		LP_LOAN_TOKEN_SPLITS.value.put(38, new BigDecimal("0.078", precision));
		LP_LOAN_TOKEN_SPLITS.value.put(39, new BigDecimal("0.0479", precision));
		LP_LOAN_TOKEN_SPLITS.value.put(40, new BigDecimal("0.0107", precision));
		LP_LOAN_TOKEN_SPLITS.value.put(41, new BigDecimal("0.0096", precision));
		LP_LOAN_TOKEN_SPLITS.value.put(42, new BigDecimal("0.0222", precision));
		LP_LOAN_TOKEN_SPLITS.value.put(43, new BigDecimal("0.0108", precision));
		LP_LOAN_TOKEN_SPLITS.value.put(44, new BigDecimal("0.008", precision));
		LP_LOAN_TOKEN_SPLITS.value.put(45, new BigDecimal("0.0144", precision));
		LP_LOAN_TOKEN_SPLITS.value.put(46, new BigDecimal("0.0166", precision));

		LP_SPLITS.value.put(4, new BigDecimal(".1454900", precision));
		LP_SPLITS.value.put(5, new BigDecimal(".77594500", precision));
		LP_SPLITS.value.put(6, new BigDecimal(".03233133", precision));
		LP_SPLITS.value.put(8, new BigDecimal(".00096900", precision));
		LP_SPLITS.value.put(10, new BigDecimal(".01939900", precision));
		LP_SPLITS.value.put(12, new BigDecimal(".00970000", precision));
		LP_SPLITS.value.put(14, new BigDecimal(".01616567", precision));
	}

	private String key;
	private T value;

	public Flag(String key, T value) {
		super();
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void print() {
		System.out.println(getAsParameter());
	}
	
	@Override
	public String getAsParameter() {
		return "[{\"" + this.key + "\":" + new Gson().toJson(this.value) + "}]";
	}

}
