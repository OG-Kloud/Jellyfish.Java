package net.kloudspace.defichain.jellyfish.apicore.categories.token;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.token.options.CreateTokenOptions;

public class CreateTokenRequest implements IRpcRequest<String> {

	private final CreateTokenOptions options;
	public CreateTokenRequest(CreateTokenOptions opts) {
		this.options = opts;
	}
	@Override
	public String getName() {
		return "createtoken";
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
