package net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.requests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models.ChainTip;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models.MempoolTx;

public class GetRawMempoolRequest implements IRpcRequest<MempoolTx[]> {

	@Override
	public String getName() {
		return "getrawmempool";
	}

	@Override
	public String getParameters() {
		return "[true]";
	}

	@Override
	public RpcResponse<MempoolTx[]> parse(JsonObject obj) throws ApiError {
		JsonObject results = obj.get("result").getAsJsonObject();
		List<MempoolTx> list = new ArrayList<>();
		Set<String> keys = results.keySet();
		keys.forEach(key ->{
			list.add(new Gson().fromJson(results.get(key).getAsJsonObject(), MempoolTx.class).setMempoolKey(key));
		});
		return new RpcResponse<>(list.toArray(new MempoolTx[list.size()]), 0);
		
	}

}
