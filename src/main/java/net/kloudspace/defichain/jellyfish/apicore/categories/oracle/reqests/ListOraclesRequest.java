package net.kloudspace.defichain.jellyfish.apicore.categories.oracle.reqests;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;

public class ListOraclesRequest implements IRpcRequest<String[]> {

	@Override
	public String getName() {
		return "listoracles";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<String[]> parse(JsonObject obj) throws ApiError {
		JsonArray array = obj.get("result").getAsJsonArray();
		List<String> list = new ArrayList<>();
		array.forEach(ele -> {
			list.add(ele.getAsString());
		});

		return new RpcResponse<>(list.toArray(new String[list.size()]), 0);
	}

}
