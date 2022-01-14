package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;

public class GetNewAddressRequest implements IRpcRequest<String> {

	private final String label;

	public GetNewAddressRequest(String label) {
		this.label = label;
	}

	@Override
	public String getName() {
		return "getnewaddress";
	}

	@Override
	public String getParameters() {
		return "[\"" + this.label + "\"]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsString(), 0);
	}

}
