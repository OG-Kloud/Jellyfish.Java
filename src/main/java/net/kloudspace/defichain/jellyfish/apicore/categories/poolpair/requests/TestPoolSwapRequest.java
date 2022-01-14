package net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.options.PoolSwapOptions;

public class TestPoolSwapRequest implements IRpcRequest<String> {

	private final PoolSwapOptions options;

	public TestPoolSwapRequest(PoolSwapOptions opts) {
		this.options = opts;
	}

	@Override
	public String getName() {
		return "testpoolswap";
	}

	@Override
	public String getParameters() {
		return options != null ? "[" + this.options.getAsParameter() + "]" : "[]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsString(), 0);
	}

}
