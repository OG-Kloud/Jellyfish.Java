package net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models.MempoolInfo;

public class GetMempoolInfoRequest implements IRpcRequest<MempoolInfo> {

	@Override
	public String getName() {
		return "getmempoolinfo";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<MempoolInfo> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result").getAsJsonObject(), MempoolInfo.class), 0);
	}

}
