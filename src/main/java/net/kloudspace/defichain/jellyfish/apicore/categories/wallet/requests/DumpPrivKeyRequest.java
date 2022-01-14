package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;

public class DumpPrivKeyRequest implements IRpcRequest<String> {

	@Override
	public String getName() {
		return "dumpprivkey";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsString(), 0);
	}

}
