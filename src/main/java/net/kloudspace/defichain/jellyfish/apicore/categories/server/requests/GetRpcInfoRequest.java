package net.kloudspace.defichain.jellyfish.apicore.categories.server.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.server.model.RpcInfo;

public class GetRpcInfoRequest implements IRpcRequest<RpcInfo> {

	@Override
	public String getName() {
		return "getrpcinfo";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<RpcInfo> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result").getAsJsonObject(), RpcInfo.class), 0);
	}

}
