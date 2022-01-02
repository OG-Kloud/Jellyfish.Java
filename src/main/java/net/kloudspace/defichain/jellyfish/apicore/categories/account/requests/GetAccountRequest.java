package net.kloudspace.defichain.jellyfish.apicore.categories.account.requests;

import java.util.Set;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.model.AccountAmount;

public class GetAccountRequest implements IRpcRequest<AccountAmount> {

	private String address = null;

	public GetAccountRequest(String address) {
		this.address = address;
	}

	@Override
	public String getName() {
		return "getaccount";
	}

	@Override
	public String getParameters() {
		return "[\"" + (this.address != null ? this.address : RpcClient.DUMMY_ADDRESS) + "\",{},true]";
	}

	@Override
	public RpcResponse<AccountAmount> parse(JsonObject obj) {
		JsonObject objs = obj.get("result").getAsJsonObject();
		Set<String> keys = objs.keySet();
		AccountAmount data = new AccountAmount(keys.size());
		keys.forEach(key -> {
			data.add(key, objs.get(key).getAsString());
		});
		return new RpcResponse<>(data, 0);
	}

}
