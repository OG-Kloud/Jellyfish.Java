package net.kloudspace.defichain.jellyfish.apicore.categories.token.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.token.model.TokenResult;

public class GetTokenRequest implements IRpcRequest<TokenResult> {
	
	private int id;
	
	public GetTokenRequest(int id) {
		this.id = id;
	}

	@Override
	public String getName() {
		return "gettoken";
	}

	@Override
	public String getParameters() {
		return "["+id+"]";
	}

	@Override
	public RpcResponse<TokenResult> parse(JsonObject obj) {
		return new RpcResponse<>(new Gson().fromJson(obj, TokenResult.class), 0);
	}

}
