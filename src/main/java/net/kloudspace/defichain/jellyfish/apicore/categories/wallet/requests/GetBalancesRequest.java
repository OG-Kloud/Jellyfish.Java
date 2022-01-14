package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model.WalletBalances;

public class GetBalancesRequest implements IRpcRequest<WalletBalances> {

	@Override
	public String getName() {
		return "getbalances";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<WalletBalances> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result").getAsJsonObject(), WalletBalances.class), 0);
	}

}
