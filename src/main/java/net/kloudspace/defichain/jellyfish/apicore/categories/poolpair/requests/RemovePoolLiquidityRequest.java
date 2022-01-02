package net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;

public class RemovePoolLiquidityRequest implements IRpcRequest<String> {
	
	private final String address;
	private final String amount;
	
	public RemovePoolLiquidityRequest(String address, String amount) {
		this.address = address;
		this.amount = amount;
	}

	@Override
	public String getName() {
		return "removepoolliquidity";
	}

	@Override
	public String getParameters() {
		return "[\""+this.address+"\",\"" + this.amount + "\"]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsString(), 0);
	}

}
