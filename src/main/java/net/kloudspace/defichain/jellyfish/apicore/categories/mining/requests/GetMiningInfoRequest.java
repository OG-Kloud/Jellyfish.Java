package net.kloudspace.defichain.jellyfish.apicore.categories.mining.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.mining.model.MiningInfo;

public class GetMiningInfoRequest implements IRpcRequest<MiningInfo> {

	@Override
	public String getName() {
		return "getmininginfo";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<MiningInfo> parse(JsonObject obj) {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result"), MiningInfo.class), 0);
	}

}
