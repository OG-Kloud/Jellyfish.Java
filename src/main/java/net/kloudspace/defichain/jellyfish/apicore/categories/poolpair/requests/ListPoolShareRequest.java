package net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.model.PoolShareResult;

public class ListPoolShareRequest implements IRpcRequest<PoolShareResult> {

	@Override
	public String getName() {
		return "listpoolshares";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<PoolShareResult> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result"), PoolShareResult.class), 0);
	}

}
