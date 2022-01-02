package net.kloudspace.defichain.jellyfish.apicore.categories.mining.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.mining.model.MiningInfo;

public class GetMiningInfoRequest<T> implements IRpcRequest<T> {

	@Override
	public String getName() {
		return "getmininginfo";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@SuppressWarnings("unchecked")
	@Override
	public RpcResponse<T> parse(JsonObject obj) {
		MiningInfo data = new MiningInfo(obj.get("results").getAsJsonObject().get("blocks").getAsNumber(),
				obj.get("results").getAsJsonObject().get("difficulty").getAsBigDecimal(),
				obj.get("results").getAsJsonObject().get("networkhashps").getAsBigDecimal(),
				obj.get("results").getAsJsonObject().get("pooledtx").getAsNumber());
		data.setChain(obj.get("results").getAsJsonObject().get("chain").getAsString());
		data.setOperator(obj.get("results").getAsJsonObject().get("isoperator").getAsBoolean());
		
		return new RpcResponse<>((T)data, 0);
	}

}
