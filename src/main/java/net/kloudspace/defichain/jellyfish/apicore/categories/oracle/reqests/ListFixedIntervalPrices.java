package net.kloudspace.defichain.jellyfish.apicore.categories.oracle.reqests;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.model.FixedIntervalPrice;

public class ListFixedIntervalPrices implements IRpcRequest<FixedIntervalPrice[]> {

	@Override
	public String getName() {
		return "listfixedintervalprices";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<FixedIntervalPrice[]> parse(JsonObject obj) throws ApiError {
		JsonArray array = obj.get("result").getAsJsonArray();
		List<FixedIntervalPrice> list = new ArrayList<>();
		array.forEach(ele -> {
			list.add(new Gson().fromJson(ele.getAsJsonObject(), FixedIntervalPrice.class));
		});

		return new RpcResponse<>(list.toArray(new FixedIntervalPrice[list.size()]), 0);
	}

}
