package net.kloudspace.defichain.jellyfish.apicore.categories.governance.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;

public class CreateVocRequest implements IRpcRequest<String> {
	
	private final String title;
	
	public CreateVocRequest(String title) {
		this.title = title;
	}

	@Override
	public String getName() {
		return "createvoc";
	}

	@Override
	public String getParameters() {
		return "[\"" + this.title + "\"]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return null;
	}

	
}
