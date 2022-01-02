package net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;

public class GetBlockCountRequest implements IRpcRequest<Number>{

	@Override
	public String getName() {
		return "getblockcount";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<Number> parse(JsonObject obj) {
		return new RpcResponse<>(obj.get("result").getAsNumber(), 0);
	}

}
