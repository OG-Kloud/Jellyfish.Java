package net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.model.PoolPairResult;

public class ListPoolPairsRequest implements IRpcRequest<PoolPairResult> {

	@Override
	public String getName() {
		return "listpoolpairs";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<PoolPairResult> parse(JsonObject obj) {
		return new RpcResponse<>(new Gson().fromJson(obj, PoolPairResult.class), 0);
	}

}
