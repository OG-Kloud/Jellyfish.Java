package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;

public class ImportPrivKeyRequest implements IRpcRequest<String> {

	private final String privKey;
	private final String label;
	private final boolean rescan;

	public ImportPrivKeyRequest(String privKey, String label, boolean rescan) {
		this.privKey = privKey;
		this.label = label;
		this.rescan = rescan;
	}

	public ImportPrivKeyRequest(String privKey) {
		this(privKey, "", true);
	}

	@Override
	public String getName() {
		return "importprivkey";
	}

	@Override
	public String getParameters() {
		return "[\"" + this.privKey + "\",\"" + this.label + "\"," + this.rescan + "]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(
				obj.get("error").isJsonNull() ? "Seems it succeceded!" : ("Error: " + obj.get("error").getAsString()), 0);
	}

}
