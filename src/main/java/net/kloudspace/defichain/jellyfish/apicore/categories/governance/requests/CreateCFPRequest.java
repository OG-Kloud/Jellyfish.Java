package net.kloudspace.defichain.jellyfish.apicore.categories.governance.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.governance.options.CFPData;

public class CreateCFPRequest implements IRpcRequest<String> {

	private final CFPData options;

	public CreateCFPRequest(CFPData options) {
		this.options = options;
	}

	@Override
	public String getName() {
		return "createcfp";
	}

	@Override
	public String getParameters() {
		return "[" + this.options.getAsParameter() + "]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsString(), 0);
	}

}
