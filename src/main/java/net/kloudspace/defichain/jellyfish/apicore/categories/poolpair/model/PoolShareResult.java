package net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.model;

import java.math.BigDecimal;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class PoolShareResult {

	private Map<String, PoolShareInfo> result;

	public void print() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(this));
	}

	public Map<String, PoolShareInfo> getResult() {
		return result;
	}

	public static class PoolShareInfo {
		private String poolID;
		private String owner;
		@SerializedName("%")
		private BigDecimal percent;
		private BigDecimal amount;
		private BigDecimal totalLiquidity;

		public String getPoolID() {
			return poolID;
		}

		public String getOwner() {
			return owner;
		}

		public BigDecimal getPercent() {
			return percent;
		}

		public BigDecimal getAmount() {
			return amount;
		}

		public BigDecimal getTotalLiquidity() {
			return totalLiquidity;
		}

	}

}
