package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model.ValidateAddressResult;

public class ValidateAddressRequest implements IRpcRequest<ValidateAddressResult> {
	
	
	private final String address;
	
	public ValidateAddressRequest(String address) {
		this.address = address;
	}

	@Override
	public String getName() {
		return "validateaddress";
	}

	@Override
	public String getParameters() {
		return "[\""+this.address+"\"]";
	}

	@Override
	public RpcResponse<ValidateAddressResult> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result").getAsJsonObject(), ValidateAddressResult.class), 0);
	}

}
