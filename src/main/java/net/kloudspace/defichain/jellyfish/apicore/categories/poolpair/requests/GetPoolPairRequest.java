package net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.model.PoolPairResult;

public class GetPoolPairRequest implements IRpcRequest<PoolPairResult> {

	private final int id;

	public GetPoolPairRequest(int id) {
		this.id = id;
	}

	@Override
	public String getName() {
		return "getpoolpair";
	}

	@Override
	public String getParameters() {
		return "[" + id + "]";
	}

	@Override
	public RpcResponse<PoolPairResult> parse(JsonObject obj) {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result"), PoolPairResult.class), 0);
	}

}
