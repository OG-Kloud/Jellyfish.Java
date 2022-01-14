package net.kloudspace.defichain.jellyfish.apicore.categories.masternode.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.masternode.model.MasternodeInfo;

public class GetMasternodeRequest implements IRpcRequest<MasternodeInfo> {

	private final String masternodeId;

	public GetMasternodeRequest(String masternodeId) {
		super();
		this.masternodeId = masternodeId;
	}

	@Override
	public String getName() {
		return "getmasternode";
	}

	@Override
	public String getParameters() {
		return "[\""+this.masternodeId+"\"]";
	}

	@Override
	public RpcResponse<MasternodeInfo> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result").getAsJsonObject(), MasternodeInfo.class), 0);
	}

}
