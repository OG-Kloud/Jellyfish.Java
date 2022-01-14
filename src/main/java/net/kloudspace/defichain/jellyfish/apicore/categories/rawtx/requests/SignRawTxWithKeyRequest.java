package net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.model.SignRawTxWithKeyResult;
import net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.options.SignRawTxWithKeyOptions;

public class SignRawTxWithKeyRequest implements IRpcRequest<SignRawTxWithKeyResult> {

	private final String rawTx;
	private final String[] privKeys;
	private final SignRawTxWithKeyOptions options;

	public SignRawTxWithKeyRequest(String rawTx, String[] privKeys, SignRawTxWithKeyOptions options) {
		super();
		this.rawTx = rawTx;
		this.privKeys = privKeys;
		this.options = options;
	}

	@Override
	public String getName() {
		return "signrawtransactionwithkey";
	}

	@Override
	public String getParameters() {
		return "[" + this.rawTx + "," + new Gson().toJson(this.privKeys)
				+ (options.getPrevTxs() != null ? "," + new Gson().toJson(this.options.getPrevTxs()) : "")
				+ (this.options.getSigHashType() != null ? "," + this.options.getSigHashType().getID() : "") + "]";
	}

	@Override
	public RpcResponse<SignRawTxWithKeyResult> parse(JsonObject obj) throws ApiError {
		return null;
	}

}
