package net.kloudspace.defichain.jellyfish.apicore.categories.token.requests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.token.model.Token;
import net.kloudspace.defichain.jellyfish.apicore.categories.token.model.TokenResult;

public class ListTokenRequest implements IRpcRequest<TokenResult> {

	@Override
	public String getName() {
		return "listtokens";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<TokenResult> parse(JsonObject obj) {
		return new RpcResponse<>(new Gson().fromJson(obj, TokenResult.class), 0);
	}

}
