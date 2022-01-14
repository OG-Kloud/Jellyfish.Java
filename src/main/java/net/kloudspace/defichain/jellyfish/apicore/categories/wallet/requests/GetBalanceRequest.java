package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests;

import java.math.BigDecimal;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;

public class GetBalanceRequest implements IRpcRequest<BigDecimal> {

	@Override
	public String getName() {
		return "getbalance";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<BigDecimal> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsBigDecimal(), 0);
	}

}
