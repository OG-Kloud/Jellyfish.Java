package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcError;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.options.CreateLoanSchemeOptions;

public class CreateLoanSchemeRequest<T> implements IRpcRequest<T>{
	
	private final CreateLoanSchemeOptions options;
	
	public CreateLoanSchemeRequest(CreateLoanSchemeOptions opts) {
		this.options = opts;
	}

	public CreateLoanSchemeOptions getOptions() {
		return options;
	}

	@Override
	public String getName() {
		return "createloanscheme";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	
	/**
	 * Temporary parse method untill this call is implemented in RPC
	 * Currently always returns: 
	 * {
    		"result": null,
    		"error": {
        		"code": -5,
        		"message": "Need foundation member authorization"
    		},
    		"id": "1.0"
		}
	 */
	@Override
	public RpcResponse<T> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new RpcError(obj.get("error").getAsJsonObject().get("code").getAsInt(), obj.get("error").getAsJsonObject().get("message").getAsString()), 0);
	}
	
	

}
