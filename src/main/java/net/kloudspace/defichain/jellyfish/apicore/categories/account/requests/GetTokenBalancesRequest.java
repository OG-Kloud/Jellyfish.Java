package net.kloudspace.defichain.jellyfish.apicore.categories.account.requests;

import java.util.Set;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.model.AccountAmount;

public class GetTokenBalancesRequest implements IRpcRequest<AccountAmount> {

	@Override
	public String getName() {
		return "gettokenbalances";
	}

	@Override
	public String getParameters() {
		return "[{},true,true]";
	}

	@Override
	public RpcResponse<AccountAmount> parse(JsonObject obj) throws ApiError {
		JsonObject objs = obj.get("result").getAsJsonObject();
		Set<String> keys = objs.keySet();
		AccountAmount data = new AccountAmount(keys.size());
		keys.forEach(key -> {
			data.add(key, objs.get(key).getAsString());
		});
		return new RpcResponse<>(data, 0);
	}

}
