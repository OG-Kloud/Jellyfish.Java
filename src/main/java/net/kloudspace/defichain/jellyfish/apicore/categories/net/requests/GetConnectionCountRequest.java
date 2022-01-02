package net.kloudspace.defichain.jellyfish.apicore.categories.net.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;

public class GetConnectionCountRequest implements IRpcRequest<String> {

	@Override
	public String getName() {
		return "getconnectioncount";
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
