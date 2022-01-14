package net.kloudspace.defichain.jellyfish.apicore.categories.masternode.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;

public class ResignMasternodeRequest implements IRpcRequest<String> {

	private final String masternodeId;

	public ResignMasternodeRequest(String masternodeId) {
		super();
		this.masternodeId = masternodeId;
	}

	@Override
	public String getName() {
		return "resignmasternode";
	}

	@Override
	public String getParameters() {
		return "[\""+this.masternodeId+"\"]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsString(), 0);
	}

}
