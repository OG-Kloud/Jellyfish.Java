package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model;

public class AddressInfo {

	private String address;
	private String scriptPubKey;
	private String desc;
	private String witness_program;
	private String hex;
	private String pubkey;
	private String label;
	private String hdkeypath;
	private String hdseedid;
	private String hdmasterfingerprint;
	private String[] pubkeys;
	private boolean ismine;
	private boolean iswatchonly;
	private boolean solvable;
	private boolean isscript;
	private boolean ischange = true;
	private boolean iswitness;
	private boolean iscompressed;
	private Number witness_version;
	private Number sigsrequired;
	private Number timestamp;
	private String script;
	private Embedded embedded;
	private Label[] labels;

	public String getAddress() {
		return address;
	}

	public String getScriptPubKey() {
		return scriptPubKey;
	}

	public String getDesc() {
		return desc;
	}

	public String getWitness_program() {
		return witness_program;
	}

	public String getHex() {
		return hex;
	}

	public String getPubkey() {
		return pubkey;
	}

	public String getLabel() {
		return label;
	}

	public String getHdkeypath() {
		return hdkeypath;
	}

	public String getHdseedid() {
		return hdseedid;
	}

	public String getHdmasterfingerprint() {
		return hdmasterfingerprint;
	}

	public String[] getPubkeys() {
		return pubkeys;
	}

	public boolean isIsmine() {
		return ismine;
	}

	public boolean isIswatchonly() {
		return iswatchonly;
	}

	public boolean isSolvable() {
		return solvable;
	}

	public boolean isIsscript() {
		return isscript;
	}

	public boolean isIschange() {
		return ischange;
	}

	public boolean isIswitness() {
		return iswitness;
	}

	public boolean isIscompressed() {
		return iscompressed;
	}

	public Number getWitness_version() {
		return witness_version;
	}

	public Number getSigsrequired() {
		return sigsrequired;
	}

	public Number getTimestamp() {
		return timestamp;
	}

	public String getScript() {
		return script;
	}

	public Embedded getEmbedded() {
		return embedded;
	}

	public Label[] getLabels() {
		return labels;
	}

	public static class Embedded {
		private String address;
		private String scriptPubKey;
		private boolean isscript;
		private boolean iswitness;
		private Number witness_version;
		private String witness_program;
		private String script;
		private String hex;
		private Number sigsrequired;
		private String pubkey;
		private String[] pubkeys;

		public String getAddress() {
			return address;
		}

		public String getScriptPubKey() {
			return scriptPubKey;
		}

		public boolean isIsscript() {
			return isscript;
		}

		public boolean isIswitness() {
			return iswitness;
		}

		public Number getWitness_version() {
			return witness_version;
		}

		public String getWitness_program() {
			return witness_program;
		}

		public String getScript() {
			return script;
		}

		public String getHex() {
			return hex;
		}

		public Number getSigsrequired() {
			return sigsrequired;
		}

		public String getPubkey() {
			return pubkey;
		}

		public String[] getPubkeys() {
			return pubkeys;
		}

	}

	public static class Label {
		private String name;
		private String purpose;

		public String getName() {
			return name;
		}

		public String getPurpose() {
			return purpose;
		}

	}

}
