package net.kloudspace.defichain.jellyfish.apicore.categories.oracle.reqests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.model.FixedIntervalPrice;

public class GetFixedIntervalPriceRequest implements IRpcRequest<FixedIntervalPrice> {

	private final String id;

	public GetFixedIntervalPriceRequest(String id) {
		this.id = id;
	}

	@Override
	public String getName() {
		return "getfixedintervalprice";
	}

	@Override
	public String getParameters() {
		return "[\""+this.id+"\"]";
	}

	@Override
	public RpcResponse<FixedIntervalPrice> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result"), FixedIntervalPrice.class), 0);
	}

}
