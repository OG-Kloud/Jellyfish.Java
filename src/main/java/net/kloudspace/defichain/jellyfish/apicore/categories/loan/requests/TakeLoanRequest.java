package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.options.TakeLoanOptions;

public class TakeLoanRequest<T> implements IRpcRequest<T> {
	
	private TakeLoanOptions options;
	
	public TakeLoanRequest(TakeLoanOptions opts) {
		this.options = opts;
	}

	@Override
	public String getName() {
		return "takeloan";
	}

	@Override
	public String getParameters() {
		return "["+options.getAsParameter()+"]";
	}

	@Override
	public RpcResponse<T> parse(JsonObject obj) throws ApiError {
		return null;
	}
	
	

}
