package net.kloudspace.defichain.jellyfish.apicore.categories.account.requests;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.model.AccountAmount;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.model.AccountOwner;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.model.AccountResult;

public class ListAccountsRequest implements IRpcRequest<AccountResult<AccountOwner, AccountAmount>[]> {

	@Override
	public String getName() {
		return "listaccounts";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@SuppressWarnings("unchecked")
	@Override
	public RpcResponse<AccountResult<AccountOwner, AccountAmount>[]> parse(JsonObject obj) {
		JsonArray array = obj.get("result").getAsJsonArray();
		List<AccountResult<AccountOwner, AccountAmount>> data = new ArrayList<>();
		array.forEach(ele->{
			data.add(new Gson().fromJson(ele.getAsJsonObject(), AccountResult.class));
		});
		return new RpcResponse<>(data.toArray(new AccountResult[data.size()]), 0);
		
	}

}
