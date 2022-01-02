package net.kloudspace.defichain.jellyfish.apicore.categories.account.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;

public class GetBalanceRequest<T> implements IRpcRequest<T>{

	@Override
	public String getName() {
		return "stats";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<T> parse(JsonObject obj) {
		System.out.println(obj.toString());
		return null;
	}
	
	

}
