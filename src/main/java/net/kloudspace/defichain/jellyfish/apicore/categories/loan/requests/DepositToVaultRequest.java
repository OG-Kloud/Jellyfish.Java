package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.DepositToVaultOptions;

public class DepositToVaultRequest<T> implements IRpcRequest<T> {
	
	private DepositToVaultOptions options;
	
	public DepositToVaultRequest(DepositToVaultOptions opts) {
		this.options = opts;
	}

	@Override
	public String getName() {
		return "deposittovault";
	}

	@Override
	public String getParameters() {
		return "["+options.getAsParameter()+"]";
	}

	@Override
	public RpcResponse<T> parse(JsonObject obj) throws ApiError {
		// TODO Auto-generated method stub
		return null;
	}

}
