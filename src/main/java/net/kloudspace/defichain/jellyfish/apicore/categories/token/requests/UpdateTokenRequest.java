package net.kloudspace.defichain.jellyfish.apicore.categories.token.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.token.options.UpdateTokenOptions;

public class UpdateTokenRequest implements IRpcRequest<String> {

	private final UpdateTokenOptions options;

	public UpdateTokenRequest(UpdateTokenOptions opts) {
		this.options = opts;
	}

	@Override
	public String getName() {
		return "updatetoken";
	}

	@Override
	public String getParameters() {
		return "["+this.options.getAsParameter()+"]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsString(), 0);
	}

}
