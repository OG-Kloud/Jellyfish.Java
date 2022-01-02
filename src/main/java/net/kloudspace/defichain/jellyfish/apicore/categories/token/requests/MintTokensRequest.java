package net.kloudspace.defichain.jellyfish.apicore.categories.token.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;

public class MintTokensRequest implements IRpcRequest<String> {
	
	private final String amount;
	
	public MintTokensRequest(String amount) {
		this.amount = amount;
	}

	@Override
	public String getName() {
		return "minttokens";
	}

	@Override
	public String getParameters() {
		return "[{\"" + this.amount + "\"}]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsString(), 0);
	}

}
