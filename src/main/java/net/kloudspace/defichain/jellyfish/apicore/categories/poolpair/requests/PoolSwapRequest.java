package net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.options.PoolSwapOptions;

public class PoolSwapRequest implements IRpcRequest<String> {

	private final PoolSwapOptions options;
	
	public PoolSwapRequest(PoolSwapOptions opts) {
		this.options = opts;
	}
	
	@Override
	public String getName() {
		return "poolswap";
	}

	@Override
	public String getParameters() {
		return "[" + this.options.getAsParameter() + "]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsString(), 0);
	}

}
