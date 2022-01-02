package net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.options.PoolSwapOptions;

public class CompositeSwapRequest implements IRpcRequest<String> {

	private final PoolSwapOptions options;

	public CompositeSwapRequest(PoolSwapOptions opts) {
		this.options = opts;
	}

	@Override
	public String getName() {
		return "compositeswap";
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
