package net.kloudspace.defichain.jellyfish.apicore.categories.account.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.model.CommunityBalanceData;

public class ListCommunityBalancesRequest implements IRpcRequest<CommunityBalanceData> {

	@Override
	public String getName() {
		return "listcommunitybalances";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<CommunityBalanceData> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result").getAsJsonObject(), CommunityBalanceData.class), 0);
	}

}
