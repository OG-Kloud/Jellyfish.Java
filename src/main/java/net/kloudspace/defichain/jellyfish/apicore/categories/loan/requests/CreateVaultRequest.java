package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;

public class CreateVaultRequest<T> implements IRpcRequest<T> {
	
	private final String address;
	
	public CreateVaultRequest(String address) {
		this.address = address;
	}

	@Override
	public String getName() {
		return "createvault";
	}

	@Override
	public String getParameters() {
		return "["+this.address+"]";
	}

	@Override
	public RpcResponse<T> parse(JsonObject obj) throws ApiError {
		return null;
	}
	
	

}
