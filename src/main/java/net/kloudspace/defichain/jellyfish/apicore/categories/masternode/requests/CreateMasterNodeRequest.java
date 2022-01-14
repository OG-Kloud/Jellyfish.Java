package net.kloudspace.defichain.jellyfish.apicore.categories.masternode.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.masternode.options.CreateMasternodeOptions;

public class CreateMasterNodeRequest implements IRpcRequest<String> {

	private final String ownerAddress;
	private final String operatorAddress;
	private final CreateMasternodeOptions options;

	public CreateMasterNodeRequest(String ownerAddress, String operatorAddress, CreateMasternodeOptions options) {
		this.ownerAddress = ownerAddress;
		this.operatorAddress = operatorAddress;
		this.options = options;
	}

	@Override
	public String getName() {
		return "createmasternode";
	}

	@Override
	public String getParameters() {
		return "[\"" + this.ownerAddress + "\",\"" + this.operatorAddress + "\""
				+ (options != null ? "," + this.options.getAsParameter() + "]" : "]");
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsString(), 0);
	}

}
