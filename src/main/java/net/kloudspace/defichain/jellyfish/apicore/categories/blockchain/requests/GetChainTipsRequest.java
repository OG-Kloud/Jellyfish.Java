package net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.requests;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models.ChainTip;

public class GetChainTipsRequest implements IRpcRequest<ChainTip[]> {

	@Override
	public String getName() {
		return "getchaintips";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<ChainTip[]> parse(JsonObject obj) throws ApiError {
		JsonArray array = obj.get("result").getAsJsonArray();
		List<ChainTip> list = new ArrayList<>();
		array.forEach(ele -> {
			list.add(new Gson().fromJson(ele.getAsJsonObject(), ChainTip.class));
		});

		return new RpcResponse<>(list.toArray(new ChainTip[list.size()]), 0);
	}
	
	

}
