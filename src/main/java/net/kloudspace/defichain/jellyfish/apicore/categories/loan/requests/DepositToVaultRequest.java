package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.DepositToVaultOptions;

public class DepositToVaultRequest implements IRpcRequest<String> {
	
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
		return options != null ? "["+options.getAsParameter()+"]" : "[]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result"), String.class), 0);
	}

}
