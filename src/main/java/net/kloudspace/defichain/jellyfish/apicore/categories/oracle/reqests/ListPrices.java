package net.kloudspace.defichain.jellyfish.apicore.categories.oracle.reqests;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.model.ListPricesData;

public class ListPrices implements IRpcRequest<ListPricesData[]> {

	@Override
	public String getName() {
		return "listprices";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<ListPricesData[]> parse(JsonObject obj) throws ApiError {
		JsonArray array = obj.get("result").getAsJsonArray();
		List<ListPricesData> list = new ArrayList<>();
		array.forEach(ele -> {
			list.add(new Gson().fromJson(ele.getAsJsonObject(), ListPricesData.class));
		});

		return new RpcResponse<>(list.toArray(new ListPricesData[list.size()]), 0);
	}

}
