package net.kloudspace.defichain.jellyfish.apicore.categories.masternode.requests;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.masternode.model.MasternodeAnchor;

public class ListAnchorsRequest implements IRpcRequest<MasternodeAnchor[]> {

	@Override
	public String getName() {
		return "listanchors";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<MasternodeAnchor[]> parse(JsonObject obj) throws ApiError {
		JsonArray array = obj.get("result").getAsJsonArray();
		List<MasternodeAnchor> list = new ArrayList<>();
		array.forEach(ele -> {
			list.add(new Gson().fromJson(ele.getAsJsonObject(), MasternodeAnchor.class));
		});

		return new RpcResponse<>(list.toArray(new MasternodeAnchor[list.size()]), 0);
	}

}
