package net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.model;

import com.google.gson.annotations.SerializedName;

public class TestMempoolAcceptResult {

	private String txid;
	private boolean allowed;
	@SerializedName("reject-reason")
	private String rejectReason;

	public String getTxid() {
		return txid;
	}

	public boolean isAllowed() {
		return allowed;
	}

	public String getRejectReason() {
		return rejectReason;
	}

}
