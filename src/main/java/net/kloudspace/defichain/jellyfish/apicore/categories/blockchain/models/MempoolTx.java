package net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models;

import java.math.BigDecimal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class MempoolTx {

	private Number vsize;
	private Number weight;
	private Number time;
	private Number height;
	private Number descendantsize;
	private Number decendantfees;
	private Number ancestorcount;
	private Number ancestorfees;
	private BigDecimal fee;
	private BigDecimal modifiedfee;
	private String wtxid;
	private Fees fees;
	private String[] depends;
	private String[] spentby;
	@SerializedName("bip125-replaceable")
	private boolean bip125;
	
	private String mempoolkey;
	
	public MempoolTx setMempoolKey(String key) {this.mempoolkey = key;return this;}
	public String getMempoolKey() {return this.mempoolkey;}
	
	public void print() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(this));
	}

	public Number getVsize() {
		return vsize;
	}

	public Number getWeight() {
		return weight;
	}

	public Number getTime() {
		return time;
	}

	public Number getHeight() {
		return height;
	}

	public Number getDescendantsize() {
		return descendantsize;
	}

	public Number getDecendantfees() {
		return decendantfees;
	}

	public Number getAncestorcount() {
		return ancestorcount;
	}

	public Number getAncestorfees() {
		return ancestorfees;
	}

	public BigDecimal getFee() {
		return fee;
	}

	public BigDecimal getModifiedfee() {
		return modifiedfee;
	}

	public String getWtxid() {
		return wtxid;
	}

	public Fees getFees() {
		return fees;
	}

	public String[] getDepends() {
		return depends;
	}

	public String[] getSpentby() {
		return spentby;
	}

	public boolean isBip125() {
		return bip125;
	}

	public static class Fees {
		private BigDecimal base;
		private BigDecimal modified;
		private BigDecimal ancestor;
		private BigDecimal descendant;

		public BigDecimal getBase() {
			return base;
		}

		public BigDecimal getModified() {
			return modified;
		}

		public BigDecimal getAncestor() {
			return ancestor;
		}

		public BigDecimal getDescendant() {
			return descendant;
		}

	}

}
