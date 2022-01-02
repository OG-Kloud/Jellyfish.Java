package net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;

public class GetDifficultyRequest implements IRpcRequest<Number> {

	@Override
	public String getName() {
		return "getdifficulty";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<Number> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsNumber(), 0);
	}

}
