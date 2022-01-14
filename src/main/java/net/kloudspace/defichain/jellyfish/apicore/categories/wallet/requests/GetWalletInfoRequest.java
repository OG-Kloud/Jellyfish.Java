package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model.WalletInfo;

public class GetWalletInfoRequest implements IRpcRequest<WalletInfo> {

	@Override
	public String getName() {
		return "getwalletinfo";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<WalletInfo> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result").getAsJsonObject(), WalletInfo.class), 0);
	}

}
